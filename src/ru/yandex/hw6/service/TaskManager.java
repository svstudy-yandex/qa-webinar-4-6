package ru.yandex.hw6.service;

import ru.yandex.hw6.model.Subtask;
import ru.yandex.hw6.model.Task;

import java.util.List;

public interface TaskManager {
    List<Task> getHistory();

    void addSubtask(Subtask subtask);

    // add, get, update, delete

    // List<Task> getPrioritizedTasks();
}
