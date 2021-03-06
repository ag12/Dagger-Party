package com.amgh.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    @Inject EventBus mEventBus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        if (null == mEventBus) {
            Log.v("MyApp", "MA2: Event Bus is null");
        } else {
            Log.v("MyApp", "MA2: Event Bus is not null");
        }

        Log.v("MyApp", "Injecting ");
        ((MyApp) getApplication()).getEventComponent().inject(this);

        if (null == mEventBus) {
            Log.v("MyApp", "MA2: Event Bus is null");
        } else {
            Log.v("MyApp", "MA2: Event Bus is not null");
        }
    }

}
