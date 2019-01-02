package app.meetup.presenter.impl;

import android.content.Context;

import java.util.List;

import app.meetup.db.DatabaseManager;
import app.meetup.interactor.NewsInteractor;
import app.meetup.model.AnswersResponse;
import app.meetup.model.entity.News;
import app.meetup.presenter.INewsPresenter;
import app.meetup.view.INewsView;
import io.realm.Realm;
import io.realm.RealmResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsPresenter extends BasePresenter implements INewsPresenter {
    private INewsView mINewsView;
    private NewsInteractor mInteractor;
    private Realm realm;

    public NewsPresenter(INewsView INewsView, Context context) {
        mINewsView = INewsView;
        mInteractor = new NewsInteractor(context);
        realm = DatabaseManager.getRealm(context);
    }

    public void loadData() {
        mInteractor.fetchNews(new Callback<AnswersResponse>() {
            @Override
            public void onResponse(Call<AnswersResponse> call, Response<AnswersResponse> response) {
                addData(response.body().getResponse().getNews());
                mINewsView.display(realm.where(News.class).findAll());
            }

            @Override
            public void onFailure(Call<AnswersResponse> call, Throwable t) {

            }
        });
    }

    private void addData(List<News> newsList) {
        mInteractor.addtoDB(newsList);
    }
}
