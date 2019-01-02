package app.meetup.interactor;


import app.meetup.model.AnswersResponse;
import retrofit2.Callback;

public interface INewsInteractor {
        void fetchNews(Callback<AnswersResponse> callback);
//    void fetchNews();
}
