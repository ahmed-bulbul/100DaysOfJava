package bulbul;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Avoid recursive invocation on computeIfAbsent() in HashMap
 *
 * */

public class Day002 {

    static Map<Integer, BigInteger> cache = new ConcurrentSkipListMap<>(
            Map.of(0,BigInteger.ZERO,1,BigInteger.ONE)
    );

    public static BigInteger fibonacci(int n){
        return cache.computeIfAbsent(n,
                key -> fibonacci(key-1).add(fibonacci(key-2)));
    }

    public static void main(String[] args) {
        var fibonacciof100 = fibonacci(100);
        System.out.println("fibonacciof100 = "+fibonacciof100);
    }

}
