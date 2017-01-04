package com.example;

/**
 * Created by fabiohh on 12/31/16.
 */

public class Joke {
    protected String joke;

    public Joke() {
        joke = "";
    }

    public Joke(String joke) {
        if (null != joke && !joke.isEmpty()) {
            this.joke = joke;
        }
    }

    public String getJoke() {
        return joke;
    }
}
