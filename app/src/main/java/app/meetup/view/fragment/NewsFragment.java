package app.meetup.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import app.meetup.R;
import app.meetup.adapter.NewsFragmentAdapter;
import app.meetup.db.DatabaseManager;
//import app.meetup.model.AnswersResponse;
import app.meetup.interactor.NewsInteractor;
import app.meetup.model.entity.News;
import app.meetup.networking.APIService;
import app.meetup.presenter.impl.BasePresenter;

import app.meetup.presenter.impl.NewsPresenter;
import app.meetup.view.INewsView;
import io.realm.Realm;
import io.realm.RealmResults;

public class NewsFragment extends BaseFragment<NewsPresenter> implements INewsView {
    private RecyclerView rvNews;
    private NewsFragmentAdapter mNewsFragmentAdapter;
    private APIService mAPIService;
    private Realm realm;
    private NewsPresenter mPresenter;


    @Override
    protected int getLayoutResource() {

        return R.layout.fragment_news;
    }

    @Override
    protected NewsPresenter initPresenter() {
        return new NewsPresenter(this, getContext());
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        realm = DatabaseManager.getRealm(getContext());
//        mAPIService = APIUtils.getService();
//
//        Call<ListNewsAnswersResponse> call = mAPIService.getListNews();
//        call.enqueue(new Callback<ListNewsAnswersResponse>() {
//            @Override
//            public void onResponse(Call<ListNewsAnswersResponse> call, Response<ListNewsAnswersResponse> response) {
//                realm.beginTransaction();
//                realm.deleteAll();
//                realm.insert(response.body().getResponse().getNews());
//                realm.commitTransaction();
//            }
//            @Override
//            public void onFailure(Call<ListNewsAnswersResponse> call, Throwable t) {
//                Log.e("ABC", t.toString());
//            }
//        });

//        RealmResults<News> r = realm.where(News.class).findAll();
//        mPresenter = new NewsPresenter(this, getContext());
        getPresenter().loadData();
//        mPresenter.loadData();


    }

    @Override
    protected void initView(Bundle savedInstanceState, View rootView) {
        rvNews = rootView.findViewById(R.id.rvNews);

    }

    @Override
    public void display(RealmResults<News> results) {
        mNewsFragmentAdapter = new NewsFragmentAdapter(getContext(), results);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rvNews.setLayoutManager(linearLayoutManager);
        rvNews.setAdapter(mNewsFragmentAdapter);
    }
}
