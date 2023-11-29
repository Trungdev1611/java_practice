package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entity.Student;

public class StreamExample {
    public static List<Student> students = Arrays.asList(
            new Student("Trung", 18, 12, true, Arrays.asList("java")),
            new Student("Nam", 25, 12, false, Arrays.asList("Python")),
            new Student("Quang", 35, 12, true, Arrays.asList("javascript"))

    );

    public static void main(String[] args) {
        Map<String, List<String>> map = students.stream()
                .filter(item -> item.getIsLearnOnlineCourse())
                .collect(Collectors.toMap(item -> item.getName(), item -> item.getListCourse()));

        System.out.println(map);

    }

}
