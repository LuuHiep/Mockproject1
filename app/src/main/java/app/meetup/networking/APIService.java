package app.meetup.networking;

//import app.meetup.model.AnswersResponse;
import app.meetup.model.AnswersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("listNews")
    Call<AnswersResponse> getListNews();

    @GET("listNearlyEvents")
    Call<AnswersResponse> getlistNearlyEvents(@Query("radius") String radius, @Query("longitue") String longitue, @Query("latitude") String latitude);
}
