package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by fabiohh on 1/3/17.
 */

public class TestAsyncActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "TestCase"));
    }
}
