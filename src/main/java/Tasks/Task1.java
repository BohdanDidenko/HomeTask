package Tasks;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Task 1:
The method takes a list of names. Returns a string of the form "1. Ivan, 3. Peter ...",
only with names on odd indices, respectively.
*/

public class Task1 {
    public static String getOddValues(List<String> list) {
        return
                IntStream.rangeClosed(1, list.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(e -> e + ". " + list.get(e))
                .collect(Collectors.joining(","));
    }
}
