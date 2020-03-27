package org.johnsoft.kata;

public class DRoot {
    public static int digital_root(int n) {
        if (n < 10) return n;
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            sum += i % 10;
        }
        return digital_root(sum);
    }
}
