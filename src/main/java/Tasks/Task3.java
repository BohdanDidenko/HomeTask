package Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Task 3:
Given  and collection = Arrays.asList ("1, 2, 0", "4, 5")
From the collection get all the numbers listed, separated by commas from all the elements
*/

public class Task3 {
    public static List<String> getNumbersByListString(List<String> list) {
        return list.stream()
                .flatMap((p) -> Arrays.asList(p.split(", ")).stream())
                .collect(Collectors.toList());
    }
}