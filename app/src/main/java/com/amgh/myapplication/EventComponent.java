package com.amgh.myapplication;

import dagger.Component;

/**
 * Created by amirghoreshi on 04/01/16.
 */
@AppScope
@Component (dependencies = AppComponent.class, modules = EventModule.class)
public interface EventComponent {
    void inject(MainActivity mainActivity);
    void inject(Main2Activity main2Activity);
}
