package org.johnsoft.kata;

public class ProdFib {
        public static long[] productFib(long prod) {
            return fib(prod, 0, 1);
        }

        public static long[] fib(long prod, long... data) {
            long a = data[0];
            long b = data[1];
            long m = b * (a + b);
            return m < prod ?
                    fib(prod, b, a + b) :
                    new long[]{b, a + b, m != prod ? 0 : 1};
        }
}
