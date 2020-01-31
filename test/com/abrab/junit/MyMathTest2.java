package com.abrab.junit;

import org.junit.*;

public class MyMathTest2 {

    MyMath myMath;

    @Before
    public void beforeTest() {
        myMath = new MyMath();
    }

    @After
    public void afterTest() {
        myMath = null;
    }

    @Test
    public void sum_simple() {
        Assert.assertEquals(5, myMath.sum(new int[]{1, 4}), 0);
    }

    @Test
    public void sum_with_negatives() {
        Assert.assertEquals(-5, myMath.sum(new int[]{-1, -4}), 0);
    }
}
