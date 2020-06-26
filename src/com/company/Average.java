package com.company;

public class Average {
    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        double[] scores = new double [ARRAY_SIZE];
        double total = 0;
        double average;
        for (int index = 0; index < scores.length; index++)
            total += scores[index];
        average = total / scores.length;
    }
}
