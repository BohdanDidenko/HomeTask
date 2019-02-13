package Tasks;

/*
Task 4:
Using Stream.iterate, make an infinite stream of random numbers — not by calling Math.random
but by directly implementing a linear congruential generator. In such a generator,
you start with x[0] = seed and then produce x[n + 1] = 1 (a x[n] + c) % m, for appropriate values of a, c, and m.
You should implement a method with parameters a, c, m, and seed that yields a Stream<Long>. Try out a = 25214903917, c = 11, and m = 2^48.
*/

import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> linearCongruentialGenerator(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
