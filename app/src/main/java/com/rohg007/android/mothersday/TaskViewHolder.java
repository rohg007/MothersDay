package com.rohg007.android.mothersday;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class TaskViewHolder extends RecyclerView.ViewHolder {
    public TextView taskTv;
    public CardView taskCard;

    public TaskViewHolder(@NonNull final View itemView){
        super(itemView);
        taskTv = itemView.findViewById(R.id.task_name_tv);
        taskCard = itemView.findViewById(R.id.task_card);
    }
}
