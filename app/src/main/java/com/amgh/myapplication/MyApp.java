package com.amgh.myapplication;

import android.app.Application;

/**
 * Created by amirghoreshi on 04/01/16.
 */
public class MyApp extends Application {

    private AppComponent appComponent;
    private EventComponent eventComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        eventComponent = DaggerEventComponent.builder()
                .appComponent(appComponent)
                .eventModule(new EventModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
    public EventComponent getEventComponent() {
        return eventComponent;
    }
}
