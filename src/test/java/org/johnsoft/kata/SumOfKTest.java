package org.johnsoft.kata;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfKTest {

    @Test
    public void BasicTests1() {
        System.out.println("****** Basic Tests small numbers******");
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        int n = SumOfK.chooseBestSum(163, 3, ts);
        assertEquals(163, n);
        ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
        //91, 74, 73, 85, 73, 81, 87
        // 91 + 74 = 165
        // 165 + 73
        Integer m = SumOfK.chooseBestSum(331, 5, ts);
        assertEquals(null, m);
        ts = new ArrayList<>(Arrays.asList(100, 76, 56, 44, 89, 73, 68, 56, 64, 123, 2333, 144, 50, 132, 123, 34, 89));
        m = SumOfK.chooseBestSum(8, 430, ts);
        assertEquals(null, m);
        ts = new ArrayList<>(Arrays.asList(100, 76, 56, 44, 89, 73, 68, 56, 64, 123, 2333, 144, 50, 132, 123, 34, 89));
        m = SumOfK.chooseBestSum(3, 246, ts);
        assertEquals(null, m);
        ts = new ArrayList<>(Arrays.asList(50));
         m = SumOfK.chooseBestSum(163, 3, ts);
        assertEquals(null, m);
        ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
        int n1 = SumOfK.chooseBestSum(230, 3, ts);
        assertEquals(228, n1);
    }
}