package app.meetup.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import app.meetup.presenter.impl.BasePresenter;

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {
    private T presenter;

    protected abstract void initData(Bundle savedInstanceState);

    protected abstract void initView(Bundle savedInstanceState);

    protected abstract T initPresenter();

    protected abstract int getLayoutResource();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        this.presenter = initPresenter();
        initView(savedInstanceState);
        initData(savedInstanceState);
    }

}
