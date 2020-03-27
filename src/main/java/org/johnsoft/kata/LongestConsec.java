package org.johnsoft.kata;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        Map<Integer, String> temp = new HashMap<>();
        for (int i = 0; i < strarr.length - k + 1; i++) {
            String consecStr = IntStream.range(i, i + k)
                    .mapToObj(j -> strarr[j])
                    .collect(Collectors.joining());

            temp.putIfAbsent(consecStr.length(), consecStr);
        }
        if (temp.isEmpty()) return "";
        int index = Collections.max(temp.keySet());
        return temp.getOrDefault(index, "");
    }
}