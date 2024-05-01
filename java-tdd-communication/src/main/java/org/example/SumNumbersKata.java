package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class SumNumbersKata {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //sort the array
    //find highest num and remove
    //find lowest num and remove
    ///sum the rest of numbers in array
    //return sum

    public int addSum(int[] input){
        Arrays.sort(input);
        int sum  = 0;
        if(input.length < 3) {
            return 0;
        }
        for(int i =1; i < input.length-1 ; i++) {
            sum += input[i];
        }
        return sum;
    }
}