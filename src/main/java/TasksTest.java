import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;
import Tasks.Task4;

import java.util.*;
import java.util.stream.Stream;

public class TasksTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Tom", "Jack", "Edward", "Mike", "John", "Allan");

        System.out.println(Task1.getOddValues(list));
        System.out.println(Task2.toUppercaseAndSortDescending(list));

        list = Arrays.asList ("1, 2, 0", "4, 5");
        System.out.println(Task3.getNumbersByListString(list));

        Stream<Long> stream = Task4.linearCongruentialGenerator(100, 25214903917L, 11, 2^48);
        stream.forEach(System.out::println);
    }
}
