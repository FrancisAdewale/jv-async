package org.example;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateMeanKataTest {

    CalculateMeanKata calculateMeanKata = new CalculateMeanKata();

    @org.junit.jupiter.api.Test
    public void calculateMean() {

        assertAll(
                () -> assertEquals(2, calculateMeanKata.calculateMean(new int[] {
                        1,2,3
                })),
                () -> assertEquals(17.25, calculateMeanKata.calculateMean(new int[] {
                        40,16,5,8
                }))
        );

    }
}
