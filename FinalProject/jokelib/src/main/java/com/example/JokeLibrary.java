package com.example;

public class JokeLibrary {
    private JokeBase jokeBase;

    public JokeLibrary() {
        jokeBase = new JokeBase("Why did the chicken cross the road? To get to the other side.");
    }

    public JokeBase getJokeBase() {
        return jokeBase;
    }
}
