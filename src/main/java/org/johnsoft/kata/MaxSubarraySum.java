package org.johnsoft.kata;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxSubarraySum {
    //
    public static int sequence(int[] arr) {
        int res = IntStream.rangeClosed(0, arr.length - 1)
                        .flatMap(i -> IntStream.rangeClosed(0, i)
                                            .map(j -> IntStream.rangeClosed(j, i)
                                                                .map(k -> arr[k])
                                                                .sum()
                                            )
                        ).max()
                        .orElse(0);
        return res < 0 ? 0 : res;
    }

    public static void main(String[] args) {
        System.out.println(MaxSubarraySum.sequence(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}) );
    }
}
