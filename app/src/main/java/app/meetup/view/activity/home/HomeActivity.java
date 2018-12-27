package app.meetup.view.activity.home;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;

import app.meetup.R;
import app.meetup.presenter.BasePresenter;
import app.meetup.view.activity.BaseActivity;
import app.meetup.view.fragment.BrowseFragment;
import app.meetup.view.fragment.HomeFragment;
import app.meetup.view.fragment.MyPageFragment;
import app.meetup.view.fragment.NearFragment;

public class HomeActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView mNavigationView;
    @Override
    protected void initData(Bundle savedInstanceState) {
        mNavigationView.setOnNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        mNavigationView = findViewById(R.id.bn_menu);
    }

    @Override
    protected BasePresenter initPresenter() {
        return null;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_home;
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container,fragment);
        transaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment;
        switch (menuItem.getItemId()) {
            case R.id.navigation_home: {
                fragment = new HomeFragment();
                loadFragment(fragment);
                return true;
            }
            case R.id.navigation_near: {
                fragment = new NearFragment();
                loadFragment(fragment);
                return true;
            }
            case R.id.navigation_browse: {
                fragment = new BrowseFragment();
                loadFragment(fragment);
                return true;
            }
            case R.id.navigation_my_page: {
                fragment = new MyPageFragment();
                loadFragment(fragment);
                return true;
            }
            default: {
                return false;
            }
        }
    }


}
