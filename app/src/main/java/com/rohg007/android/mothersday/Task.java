package com.rohg007.android.mothersday;

import java.util.ArrayList;

public class Task {
    private int type;
    private String taskName;

    public Task(int type, String taskName) {
        this.type = type;
        this.taskName = taskName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public static ArrayList<Task> getTasks(){
        ArrayList<Task> taskArrayList = new ArrayList<>();
        taskArrayList.add(new Task(1,"Task 1"));
        taskArrayList.add(new Task(2,"Task 2"));
        taskArrayList.add(new Task(3,"Task 3"));
        return taskArrayList;
    }
}
