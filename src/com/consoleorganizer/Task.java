package com.consoleorganizer;

public class Task {

    private String name;
    private String description;
    private boolean isCompleted;

    public Task(String name, String description){
        this.name = name;
        this.description = description;
        this.isCompleted = false;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void markAsCompleted(){
        isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[✔]" : "[ ]") + " " + name;
    }
}
