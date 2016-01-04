package com.amgh.myapplication;

import android.app.Application;
import android.util.Log;

import com.squareup.otto.Bus;

import java.util.Random;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by amirghoreshi on 04/01/16.
 */

@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        Log.v("MyApp", "AppModule");
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        Log.v("MyApp", "providesApplication");
        return mApplication;
    }

    @Provides
    @Singleton
    Bus providesBus() {
        Log.v("MyApp", "providesBus");
        return new Bus();
    }

    @Provides
    @Singleton
    Realm providesRealm() {
        Log.v("MyApp", "providesRealm");
        return Realm.getInstance(mApplication);
    }
}
