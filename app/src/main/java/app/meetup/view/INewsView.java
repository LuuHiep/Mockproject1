package app.meetup.view;

import app.meetup.model.entity.News;
import io.realm.RealmResults;

public interface INewsView {
    void display(RealmResults<News> results);
}
