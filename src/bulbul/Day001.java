package bulbul;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Day001 {

    static Map<Integer, BigInteger> cache = new HashMap<>(
            Map.of(0,BigInteger.ZERO,1,BigInteger.ONE)
    );

    public static BigInteger fibonacci(int n){
        if(!cache.containsKey(n)){
            BigInteger computed = fibonacci(n-1).add(fibonacci(n-2));
            cache.put(n,computed);
        }
        return cache.get(n);
    }

    public static void main(String[] args) {
        BigInteger fibonacciOf100 = fibonacci(100);
        System.out.println("fibonacciof100 = "+fibonacciOf100);
    }
}
