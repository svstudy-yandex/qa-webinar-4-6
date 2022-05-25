package ru.yandex.lambda;

class Task {
    private final int id;

    public Task(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Task" + id;
    }
}

class Car {
    private final int id;

    public Car(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car" + id;
    }

}
