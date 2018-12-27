package app.meetup.networking;

import app.meetup.model.ListNewsAnswersResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("listNews")
    Call<ListNewsAnswersResponse> getListNews();
}
