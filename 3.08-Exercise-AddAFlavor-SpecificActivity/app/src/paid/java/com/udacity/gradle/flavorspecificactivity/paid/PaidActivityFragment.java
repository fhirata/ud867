package com.udacity.gradle.flavorspecificactivity.paid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udacity.gradle.flavorspecificactivity.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class PaidActivityFragment extends Fragment {

    public PaidActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_paid, container, false);
    }
}
