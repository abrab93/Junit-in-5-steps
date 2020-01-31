package com.abrab.junit;

public class MyMath {

    public double sum(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
