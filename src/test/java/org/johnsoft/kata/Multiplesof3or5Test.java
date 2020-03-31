package org.johnsoft.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Multiplesof3or5Test {
    @Test
    public void test() {
        assertEquals(23, new Multiplesof3or5().solution(10));
    }

}