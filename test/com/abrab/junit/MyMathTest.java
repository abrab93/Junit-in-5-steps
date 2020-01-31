package com.abrab.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class MyMathTest {

    MyMath myMath;

    @Before
    public void before() {
        System.out.println("before");
        myMath = new MyMath();
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }

    @Test
    public void sum_with3numbers() {
        System.out.println("sum_with3numbers_test");
        assertEquals(6, myMath.sum(new int[]{1, 2, 3}), 0);
    }

    @Test
    public void sum_with1number() {
        System.out.println("sum_with3numbers_test");
        assertEquals(3, myMath.sum(new int[]{3}), 0);
    }

}