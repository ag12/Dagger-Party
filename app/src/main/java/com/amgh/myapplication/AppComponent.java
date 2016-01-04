package com.amgh.myapplication;

import android.app.Application;

import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;
import io.realm.Realm;

/**
 * Created by amirghoreshi on 04/01/16.
 */


@Singleton
@Component(modules={AppModule.class})
public interface AppComponent {
    Application getApplication();
    Bus getBus();
    Realm getRealm();
}
