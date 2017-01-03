package com.example.fabiohh.jokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.fabiohh.jokelibrary.JokeDisplayLibActivity.JOKE_KEY;

/**
 * Created by fabiohh on 12/31/16.
 */

public class JokeDisplayLibActivityFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_joke, container, false);

        Intent intent = getActivity().getIntent();
        String jokeString = intent.getStringExtra(JOKE_KEY);

        TextView textview = (TextView) view.findViewById(R.id.joke_textview);
        textview.setText(jokeString);

        return view;
    }
}
