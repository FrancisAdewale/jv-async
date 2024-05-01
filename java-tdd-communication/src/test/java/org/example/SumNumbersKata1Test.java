package org.example;

import static org.junit.jupiter.api.Assertions.*;

class SumNumbersKata1Test {

    @org.junit.jupiter.api.Test
    void addSum() {

        //Arranging
        SumNumbersKata sumNumbersKata = new SumNumbersKata();

        //Acting

        //Assert

        assertAll(
                () ->  assertEquals(5, sumNumbersKata.addSum(new int[]{
                        1,2,3,4
                })),
                () ->  assertEquals(0, sumNumbersKata.addSum(new int[]{
                        1,2
                })),
                () ->  assertEquals(21, sumNumbersKata.addSum(new int[]{
                        5,2,6,10,22
                }))



                );


    }
}