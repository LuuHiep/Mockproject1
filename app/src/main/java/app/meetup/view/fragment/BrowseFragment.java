package app.meetup.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import app.meetup.R;
import app.meetup.presenter.impl.BasePresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class BrowseFragment extends BaseFragment {


    public BrowseFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_browse;
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
