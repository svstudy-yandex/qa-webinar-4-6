package ru.yandex.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Отдельный класс
        sortWithSeparateClass();

        // Анонимный класс
        sortWithAnonymousClass();

        // Лямбда
        sortWithLambda();

        // Лямбда 2
        sortWithLambda2();

        // Ссылка на метод (method reference)
        sortWithMethodReference();
    }

    private static List<Task> generateTasks() {
        List<Task> tasks = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tasks.add(new Task(i));
        }
        Collections.shuffle(tasks);
        return tasks;
    }

    private static void sortWithSeparateClass() {
        List<Task> tasks = generateTasks();

        tasks.sort(new TaskComparatorById());

        System.out.println(tasks);
    }

    private static void sortWithAnonymousClass() {
        List<Task> tasks = generateTasks();

        tasks.sort(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getId() - o2.getId();
            }
        });

        System.out.println(tasks);
    }

    private static void sortWithLambda() {
        List<Task> tasks = generateTasks();

        tasks.sort((o1, o2) -> Integer.compare(o1.getId(), o2.getId()));

        System.out.println(tasks);
    }

    private static void sortWithLambda2() {
        List<Task> tasks = generateTasks();

        tasks.sort(Comparator.comparingInt(t -> t.getId()));

        System.out.println(tasks);
    }

    private static void sortWithMethodReference() {
        List<Task> tasks = generateTasks();

        tasks.sort(Comparator.comparingInt(Task::getId));

        System.out.println(tasks);
    }
}

class TaskComparatorById implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.getId() - o2.getId();
    }
}
