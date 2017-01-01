package com.udacity.gradle.builditbigger.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.JokeBase;

/**
 * Created by fabiohh on 12/31/16.
 */

public class Joke extends JokeBase implements Parcelable{
    public Joke(String joke) {
        super(joke);
    }

    public Joke(JokeBase baseJoke) {
        joke = baseJoke.getJoke();
    }

    private Joke(Parcel in) {
        joke = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(joke);
    }

    public static final Parcelable.Creator<Joke> CREATOR = new Parcelable.Creator<Joke>() {
        @Override
        public Joke createFromParcel(Parcel parcel) {
            return new Joke(parcel);
        }

        @Override
        public Joke[] newArray(int size) {
            return new Joke[size];
        }
    };
}
