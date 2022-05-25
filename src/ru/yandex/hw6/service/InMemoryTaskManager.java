package ru.yandex.hw6.service;

import ru.yandex.hw6.model.Subtask;
import ru.yandex.hw6.model.Task;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class InMemoryTaskManager implements TaskManager {
    protected final Map<Integer, Task> tasks = new HashMap<>();
    // ... epic, subtasks
    protected final HistoryManager historyManager;
    private final Map<LocalDateTime, Task> prioritizedTasks = new TreeMap<>();

    public InMemoryTaskManager() {
        this.historyManager = Managers.getDefaultHistory();
    }

    @Override
    public void addSubtask(Subtask subtask) {
        //...
    }

    /* Пример применения стрима
    protected final Map<Integer, Subtask> subtasks = new HashMap<>();
    public List<Subtask> getEpicSubtasks(int epicId) {
        return subtasks.values()
                .stream()
                .filter(s -> s.getEpicId() == epicId)
                .collect(Collectors.toList());
    }
     */

    // add, get, update, delete


    @Override
    public List<Task> getHistory() {
        return historyManager.getHistory();
    }
}
