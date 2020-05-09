package com.rohg007.android.mothersday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        RecyclerView taskRv = findViewById(R.id.task_rv);
        TaskAdapter taskAdapter = new TaskAdapter(Task.getTasks(),this);
        taskRv.setLayoutManager(new LinearLayoutManager(this));
        taskRv.setAdapter(taskAdapter);
    }
}
