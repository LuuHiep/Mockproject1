package app.meetup.interactor;

import android.content.Context;

import java.util.List;

import app.meetup.db.DatabaseManager;
import app.meetup.model.AnswersResponse;
import app.meetup.model.entity.News;
import app.meetup.networking.APIService;
import app.meetup.networking.APIUtils;
import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;

public class NewsInteractor implements INewsInteractor {
    private APIService mAPIService;
    private Context mContext;
    public NewsInteractor(Context context) {
        this.mContext = context;

    }

    //    @Override
//    public void fetchNews() {
//        mAPIService = APIUtils.getService();
//
//        Call<AnswersResponse> call = mAPIService.getListNews();
//        call.enqueue(new Callback<AnswersResponse>() {
//            @Override
//            public void onResponse(Call<AnswersResponse> call, Response<AnswersResponse> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<AnswersResponse> call, Throwable t) {
//
//            }
//        });
//    }
    @Override
    public void fetchNews(Callback<AnswersResponse> callback) {
        mAPIService = APIUtils.getService();

        Call<AnswersResponse> call = mAPIService.getListNews();
        call.enqueue(callback);
    }

    public void addtoDB(List<News> newsList) {
        Realm realm = DatabaseManager.getRealm(mContext);
        realm.beginTransaction();
        realm.deleteAll();
        realm.insert(newsList);
        realm.commitTransaction();
    }
}
