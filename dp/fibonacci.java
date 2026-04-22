package dp;

import java.time.Duration;
import java.time.Instant;

public class fibonacci {
    
    public static int fib(int n, int[] f){

        if (n == 0 || n == 1)
            return n;

        if (f[n] != 0) {
            return f[n];
        }

        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }

    public static void main(String[] args) {
        Instant startTime = Instant.now();
        
        int n = 6;
        System.out.println(fib(n, new int[n+1]));




        Instant endTime = Instant.now();
        Duration timeTaken = Duration.between(startTime, endTime);
        System.out.println("Execution in NS " + (float)timeTaken.toNanos()/ 1000000);
    }

}
