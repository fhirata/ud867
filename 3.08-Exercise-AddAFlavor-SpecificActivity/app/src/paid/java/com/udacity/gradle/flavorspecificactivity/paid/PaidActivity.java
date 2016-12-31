package com.udacity.gradle.flavorspecificactivity.paid;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.udacity.gradle.flavorspecificactivity.R;

/**
 * Created by fabiohh on 12/29/16.
 */

public class PaidActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_paid);
    }
}

