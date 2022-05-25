package ru.yandex.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<Integer> ids = generateTasks()
                // генерация
                .stream()
                // промежуточные
                .peek(System.out::println)
                .filter(t -> t.getId() % 2 == 0)
                .map(t -> t.getId())
                .sorted()
                // терминальные
                .collect(Collectors.toList());

        System.out.println(ids);

        System.out.println(nonStreamExample());
    }

    public static List<Integer> nonStreamExample() {
        List<Integer> ids = new ArrayList<>();

        for (Task t : generateTasks()) {
            if (t.getId() % 2 == 0) {
                ids.add(t.getId());
            }
        }
        ids.sort(Integer::compare);

        return ids;
    }


    private static List<Task> generateTasks() {
        List<Task> tasks = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tasks.add(new Task(i));
        }
        Collections.shuffle(tasks);
        return tasks;
    }
}
