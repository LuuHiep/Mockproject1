package app.meetup.db;

import android.content.Context;

import app.meetup.common.Constants;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class DatabaseManager {
    private static Realm sRealm = null;

    public static Realm getRealm(Context context) {
        if (sRealm == null) {
            Realm.init(context);
            RealmConfiguration configuration = new RealmConfiguration.Builder()
                    .name(Constants.NAME_DATABASE)
                    .build();
            sRealm = Realm.getInstance(configuration);
        }
        return sRealm;
    }
}
