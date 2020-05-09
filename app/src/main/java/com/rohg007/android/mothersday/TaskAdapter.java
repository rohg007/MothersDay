package com.rohg007.android.mothersday;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {
    private ArrayList<Task> tasks;
    private Context context;

    public TaskAdapter(ArrayList<Task> tasks, Context context) {
        this.tasks = tasks;
        this.context = context;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_card,parent,false);
        return new TaskViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = tasks.get(position);
        holder.taskTv.setText(task.getTaskName());
        switch (task.getType()){
            case 1: holder.taskCard.setCardBackgroundColor(Color.parseColor("#B71C1C"));
            break;
            case 2: holder.taskCard.setCardBackgroundColor(Color.parseColor("#1A237E"));
            break;
            case 3: holder.taskCard.setCardBackgroundColor(Color.parseColor("#1B5E20"));
            break;
        }
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
