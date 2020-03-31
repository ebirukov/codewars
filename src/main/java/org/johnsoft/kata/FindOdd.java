package org.johnsoft.kata;

import java.util.Arrays;
import java.util.function.*;

import static java.util.stream.Collectors.*;

public class FindOdd {
    public static int findIt(int[] a) {
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            r = r ^ a [i];
            System.out.println(r);
        }
        return r;//Arrays.stream(a).reduce(0, (x, y) -> x ^ y);
    }
}
