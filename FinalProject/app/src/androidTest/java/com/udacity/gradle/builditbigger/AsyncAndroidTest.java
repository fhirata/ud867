package com.udacity.gradle.builditbigger;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.support.test.runner.AndroidJUnit4;

import com.example.fabiohh.jokelibrary.JokeDisplayLibActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncAndroidTest {
    @Test
    public void testAsyncRequest() {

        Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(MainActivity.class.getName(), null, false);

        Context context = getInstrumentation().getContext();

        // Start Activity shell
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClassName(getInstrumentation().getTargetContext(), MainActivity.class.getName());
        getInstrumentation().startActivitySync(intent);

        Activity currentActivity = getInstrumentation().waitForMonitor(monitor);

        // Assert activity opened
        assertNotNull(currentActivity);

        monitor = getInstrumentation().addMonitor(JokeDisplayLibActivity.class.getName(), null, false);

        // Press button to trigger AsyncTask
        onView(withId(R.id.tell_joke_button)).perform(click());

        Activity jokeLibActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 3000);
        assertNotNull(jokeLibActivity);
        // if string is not available, we will make the textview gone
        assertNotNull(onView(withId(R.id.joke_textview)).check(matches(isDisplayed())));
    }

}