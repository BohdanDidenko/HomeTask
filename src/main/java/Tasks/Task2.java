package Tasks;

import java.util.List;
import java.util.stream.Collectors;

/*
Task 2:
The method map list of string to uppercase and then sort descending.
*/

public class Task2 {
    public static List<String> toUppercaseAndSortDescending(List<String> list) {
        return
                list.stream()
                .map(String::toUpperCase)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }
}
