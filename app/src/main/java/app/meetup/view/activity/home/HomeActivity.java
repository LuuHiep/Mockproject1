package app.meetup.view.activity.home;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.MenuItem;

import app.meetup.R;
import app.meetup.db.DatabaseManager;
//import app.meetup.model.AnswersResponse;
import app.meetup.model.AnswersResponse;
import app.meetup.networking.APIService;
import app.meetup.networking.APIUtils;
import app.meetup.presenter.impl.BasePresenter;
import app.meetup.view.activity.BaseActivity;
import app.meetup.view.fragment.BrowseFragment;
import app.meetup.view.fragment.HomeFragment;
import app.meetup.view.fragment.MyPageFragment;
import app.meetup.view.fragment.NearFragment;
import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView mNavigationView;
    private Realm realm;
    private APIService mAPIService;
    @Override
    protected void initData(Bundle savedInstanceState) {
        mNavigationView.setOnNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());
        realm = DatabaseManager.getRealm(this);
        mAPIService = APIUtils.getService();

        Call<AnswersResponse> call = mAPIService.getListNews();
        call.enqueue(new Callback<AnswersResponse>() {
            @Override
            public void onResponse(Call<AnswersResponse> call, Response<AnswersResponse> response) {
                realm.beginTransaction();
                realm.deleteAll();
                realm.insert(response.body().getResponse().getNews());
                realm.commitTransaction();
            }
            @Override
            public void onFailure(Call<AnswersResponse> call, Throwable t) {
                Log.e("ABC", t.toString());
            }
        });

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
