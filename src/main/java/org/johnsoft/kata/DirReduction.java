package org.johnsoft.kata;

import java.util.*;

public class DirReduction {

    enum Direction {NORTH(1), SOUTH(-1), EAST(-2), WEST(2);

        private final int value;

        Direction(int i) {
            value = i;
        }

        public boolean isOpposite(Direction direction) {
            return direction.value + value == 0;
        }
    };

    public static String[] dirReduc(String[] arr) {
        boolean hasOpposite;
        do {
            hasOpposite = false;
            for (int i = 1; i < arr.length; i++) {
                if (Direction.valueOf(arr[i - 1]).isOpposite(Direction.valueOf(arr[i]))) {
                    arr[i - 1] = null;
                    arr[i] = null;
                    i++;
                    hasOpposite = true;
                }
            }
            arr = Arrays.stream(arr).filter(Objects::nonNull).toArray(String[]::new);
        } while (hasOpposite);
        return arr;
    }
}