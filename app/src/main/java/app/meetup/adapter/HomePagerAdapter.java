package app.meetup.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import app.meetup.common.Constants;
import app.meetup.view.fragment.NewsFragment;
import app.meetup.view.fragment.PupolarFragment;

public class HomePagerAdapter extends FragmentStatePagerAdapter {
    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
        Log.e("ABC", "onHomePageAdapter");
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new NewsFragment();
                break;
            case 1:
                fragment = new PupolarFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = Constants.NEWS;
                break;
            case 1:
                title = Constants.POPULAR;
                break;
        }
        return title;
    }
}
