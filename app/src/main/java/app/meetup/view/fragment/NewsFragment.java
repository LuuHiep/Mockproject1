package app.meetup.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import app.meetup.R;
import app.meetup.adapter.NewsFragmentAdapter;
import app.meetup.model.ListNewsAnswersResponse;
import app.meetup.model.News;
import app.meetup.networking.APIService;
import app.meetup.networking.APIUtils;
import app.meetup.presenter.BasePresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsFragment extends BaseFragment {
    private RecyclerView rvNews;
    private NewsFragmentAdapter mNewsFragmentAdapter;
    private APIService mAPIService;

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
        mAPIService = (APIService) APIUtils.getListNewsService();
        Call<ListNewsAnswersResponse> call = mAPIService.getListNews();
        call.enqueue(new Callback<ListNewsAnswersResponse>() {
            @Override
            public void onResponse(Call<ListNewsAnswersResponse> call, Response<ListNewsAnswersResponse> response) {
                ArrayList<News> newsList = (ArrayList<News>) response.body().getResponse().getNews();
                mNewsFragmentAdapter = new NewsFragmentAdapter(getContext(), newsList);

                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
                rvNews.setLayoutManager(linearLayoutManager);
                rvNews.setAdapter(mNewsFragmentAdapter);
                Log.e("ABC", "OK");
            }

            @Override
            public void onFailure(Call<ListNewsAnswersResponse> call, Throwable t) {
                Log.e("ABC", t.toString());
            }
        });
    }

    @Override
    protected void initView(Bundle savedInstanceState, View rootView) {
        rvNews = rootView.findViewById(R.id.rvNews);

    }
}
