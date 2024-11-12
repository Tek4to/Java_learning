package com.consoleorganizer;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String name, String description) {
        Task newTask = new Task(name, description);
        tasks.add(newTask);
        System.out.println("Задача " + name + " создана:" + description);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Задача удалена: " + removedTask.getName());
        } else {
            System.out.println("Неверный индекс задачи.");
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
            System.out.println("Задача выполнена: " + tasks.get(index).getName());
        } else {
            System.out.println("Неверный индекс задачи.");
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            System.out.println("Список задач:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }
}
