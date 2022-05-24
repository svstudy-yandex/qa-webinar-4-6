package ru.yandex.hw6.service;

import ru.yandex.hw6.model.Task;

import java.util.List;

public interface HistoryManager {
    List<Task> getHistory();

    void add(Task task);

    void remove(int id);
}
