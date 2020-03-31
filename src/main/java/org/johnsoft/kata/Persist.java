package org.johnsoft.kata;

public class Persist {

    public static int persistence(long n) {
        if (n < 10) return 0;
        int p = 1;
        for (long i = n; i > 0; i /= 10) {
            p *= i % 10;
        }
        return persistence(p) + 1;
    }

}
