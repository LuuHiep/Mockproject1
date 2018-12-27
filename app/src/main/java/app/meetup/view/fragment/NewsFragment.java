package app.meetup.view.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import app.meetup.R;
import app.meetup.presenter.BasePresenter;

public class NewsFragment extends BaseFragment {
    @Override
    protected int getLayoutResource() {

        return R.layout.fragment_news;
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
        Log.e("ABC", "onNews");
    }
}
