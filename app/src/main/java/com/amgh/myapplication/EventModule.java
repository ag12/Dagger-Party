package com.amgh.myapplication;

import android.util.Log;

import com.squareup.otto.Bus;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amirghoreshi on 04/01/16.
 */
@Module
public class EventModule {

    @Provides
    @AppScope // needs to be consistent with the component scope
    public EventBus providesEventBus(Bus bus) {
        Log.v("MyApp", "providesEventBus");
        return new EventBus();
    }
}
