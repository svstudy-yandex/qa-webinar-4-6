package ru.yandex.hw6.service;

import ru.yandex.hw6.model.Subtask;

public class FileBackedTaskManager extends InMemoryTaskManager {

    public FileBackedTaskManager(String filePath) {

    }

    @Override
    public void addSubtask(Subtask subtask) {
        super.addSubtask(subtask);
        save();
    }

    private void save() {
        // ...
    }

    public static FileBackedTaskManager loadFromFile(String file) {
        // ...
        return null;
    }

    static void main(String[] args) {
        //...
        // TaskManager restoredManager = loadFromFile(...);
        // ...
    }
}
