package app.meetup.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.meetup.presenter.impl.BasePresenter;

public abstract class BaseFragment<T extends BasePresenter> extends Fragment {

    private T presenter;

    public T getPresenter() {
        return presenter;
    }

    public void setPresenter(T presenter) {
        this.presenter = presenter;
    }

    protected abstract int getLayoutResource();

    protected abstract T initPresenter();

    protected abstract void initData(Bundle savedInstanceState);

    protected abstract void initView(Bundle savedInstanceState, View rootView);

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutResource(), container, false);
        presenter = initPresenter();
        initView(savedInstanceState, rootView);
        initData(savedInstanceState);
        return rootView;
    }
}
