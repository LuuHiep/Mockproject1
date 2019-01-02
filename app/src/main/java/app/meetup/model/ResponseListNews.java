package app.meetup.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import app.meetup.model.entity.News;
import io.realm.RealmList;
import io.realm.RealmObject;

public class ResponseListNews extends RealmObject {
    @SerializedName("news")
    @Expose
    private RealmList<News> news = null;

    public RealmList<News> getNews() {
        return news;
    }

    public void setNews(RealmList<News> news) {
        this.news = news;
    }
}

