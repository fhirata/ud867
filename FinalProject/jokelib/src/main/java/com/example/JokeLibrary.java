package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class JokeLibrary {
    private Joke jokeBase;
    private int jokeCount = 6;
    private ArrayList<String> jokeList = new ArrayList<>(Arrays.asList(
            "There was a priest who got into a car wreck and died. At the pearly gates there was a long line in front of the priest and the person right in front of the priest was the taxi driver.\n" +
                    "\n" +
                    "When the taxi driver was the next person in line, Saint Peter takes one look at him and gives him a silk robe and a golden staff and sends him into heaven.\n" +
                    "\n" +
                    "Then Saint Peter looks at the Priest and hands him a cotton robe and a wooden staff and sends him into heaven.\n" +
                    "\n" +
                    "The Priest was perplexed and asked Saint Peter,\"He why did the taxi driver get all of the fancy stuff while I get this cheap stuff.\" Then Saint Peter calmly said,\"When you were preaching people were sleeping, and when the Taxi driver was driving people were praying.\"",
            "There was a preacher who fell in the ocean and he couldn’t swim. When a boat came by, the captain yelled, “Do you need help, sir?” The preacher calmly said “No, God will save me.”\n" +
                    "\n" +
                    "A little later, another boat came by and a fisherman asked, “Hey, do you need help?” The preacher replied again, “No God will save me.”\n" +
                    "\n" +
                    "Eventually the preacher drowned & went to heaven. The preacher asked God, “Why didn’t you save me?” God replied, “Fool, I sent you two boats!”",
            "Diner: I can't eat this chicken. Call the manager. \n" +
                    "Waiter: It's no use. He can't eat it either.",
            "Normal people believe that if it ain't broke, don't fix it.\n" +
                    "\n" +
                    "Engineers believe that if it ain't broke, it doesn't have enough features yet.",
            "A wife asks her husband, a software engineer...\n" +
                    "\"Could you please go shopping for me and buy one carton of milk, and if they have eggs, get 6!\" A short time later the husband comes back with 6 cartons of milk. The wife asks him, \"Why the hell did you buy 6 cartons of milk?\" He replied, \"They had eggs.\"",
            "The graduate with a science degree asks, \"Why does it work?\" \n" +
                    "\n" +
                    "The graduate with an engineering degree asks, \"How does it work?\" \n" +
                    "\n" +
                    "The graduate with an accounting degree asks, \"How much will it cost?\" \n" +
                    "\n" +
                    "The graduate with an arts degree asks, \"Do you want fries with that?\"",
            "\"Why did the chicken cross the road? To get to the other side.\""
    ));

    public JokeLibrary() {
    }

    public Joke getRandomJoke() {

        int timeMillis = (int) System.currentTimeMillis();

        jokeBase = new Joke(jokeList.get((timeMillis % jokeCount)));

        return jokeBase;
    }
}
