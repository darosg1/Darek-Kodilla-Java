package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //given
        int[] numbers = new int[20];
        numbers[0] = 0;
        numbers[1] = 2;
        numbers[2] = 6;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;
        numbers[10] = 11;
        numbers[11] = 2;
        numbers[12] = 13;
        numbers[13] = 14;
        numbers[14] = 5;
        numbers[15] = 16;
        numbers[16] = 17;
        numbers[17] = 18;
        numbers[18] = 19;
        numbers[19] = 10;
        //when
        double ave = ArrayOperations.getAverage(numbers);
        //then
        Assert.assertEquals(9.1, ave, 0.001);
    }
}
