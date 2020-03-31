package org.johnsoft.kata;

import java.math.BigInteger;

public class GapInPrimes {
    public static long[] gap(int g, long m, long n) {
        for (long num = m; num < n; num += 1) {
            if (new BigInteger(String.valueOf(num)).isProbablePrime(1)
                    && new BigInteger(String.valueOf(num)).nextProbablePrime().longValue() - num == g)
                return new long[]{num, (num + g)};
        }
        return null;
    }

}
