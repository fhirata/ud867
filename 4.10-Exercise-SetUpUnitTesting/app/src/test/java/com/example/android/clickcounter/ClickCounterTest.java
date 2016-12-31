package com.example.android.clickcounter;

import org.junit.Test;

public class ClickCounterTest  {
    @Test
    public void verifyIncrement() {
        ClickCounter counter = new ClickCounter();
        assert counter.getCount() == 0;
        counter.increment();
        assert counter.getCount() == 1;
    }
}
