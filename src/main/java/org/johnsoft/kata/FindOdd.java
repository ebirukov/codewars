package org.johnsoft.kata;

import java.util.Arrays;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class FindOdd {
    public static int findIt(int[] a) {
        Arrays.stream(a).boxed().collect(groupingBy(Function.identity(), counting()))
                ;

        return 0;
    }
}
