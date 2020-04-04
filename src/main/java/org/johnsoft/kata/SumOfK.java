package org.johnsoft.kata;

import java.util.List;

public class SumOfK {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        return sub(0, t, k, ls);
    }

    public static Integer sub(Integer sum, int t, int k, List<Integer> ls) {
        if (sum == null) return sum;
        Integer nearest = null;
        for (int i = 0; i < ls.size(); i++) {
            Integer s = sum + ls.get(i);
            if (k > 1) {
                s = sub(s, t, k-1, ls.subList(i + 1, ls.size()));
            }
            if (s != null && s <= t) {
                nearest = (nearest == null) ? s : Math.max(nearest, s);
            }
        }
        return nearest;
    }

}

