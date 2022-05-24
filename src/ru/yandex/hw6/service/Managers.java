package ru.yandex.hw6.service;

public class Managers {
    public static TaskManager getDefault() {
        return new FileBackedTaskManager("resources/tasks.csv");
    }

    public static HistoryManager getDefaultHistory() {
        return new InMemoryHistoryManager();
    }
}
