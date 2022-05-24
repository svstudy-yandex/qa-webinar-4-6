package ru.yandex.hw6.service;

import ru.yandex.hw6.model.Subtask;
import ru.yandex.hw6.model.Task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTaskManager implements TaskManager {
    protected final Map<Integer, Task> tasks = new HashMap<>();
    // ... epic, subtasks
    protected final HistoryManager historyManager;
    // private final Map<LocalDateTime, Task> prioritizedTasks = new TreeMap<>();

    public InMemoryTaskManager() {
        this.historyManager = Managers.getDefaultHistory();
    }

    @Override
    public void addSubtask(Subtask subtask) {
        //...
    }

    // add, get, update, delete


    @Override
    public List<Task> getHistory() {
        return historyManager.getHistory();
    }
}
