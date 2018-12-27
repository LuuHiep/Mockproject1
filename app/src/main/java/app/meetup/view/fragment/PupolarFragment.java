package app.meetup.view.fragment;

import android.os.Bundle;
import android.view.View;

import app.meetup.R;
import app.meetup.presenter.BasePresenter;

public class PupolarFragment extends BaseFragment {
    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_popular;
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
