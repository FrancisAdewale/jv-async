package org.example;

public class CalculateMeanKata {

    public double calculateMean(int[] input) {
        double sum = 0;
        int length = input.length;

        for(Integer n : input) {
            sum += n;
        }
        return sum / length;
    }
}
