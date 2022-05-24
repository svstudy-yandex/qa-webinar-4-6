package ru.yandex.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<Integer> ids = generateTasks()
                .stream()
                .filter(t -> t.getId() % 2 == 0)
                .map(t -> t.getId())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(ids);
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
