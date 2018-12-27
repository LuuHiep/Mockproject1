package app.meetup.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.meetup.R;
import app.meetup.presenter.BasePresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearFragment extends BaseFragment {


    public NearFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_near;
    }

    @Override
    protected BasePresenter initPresenter() {
        return null;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(Bundle savedInstanceState, View rootView) {

    }

}
