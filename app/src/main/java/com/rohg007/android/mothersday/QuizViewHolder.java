package com.rohg007.android.mothersday;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class QuizViewHolder extends RecyclerView.ViewHolder{
        TextView questionNumberTv;
        TextView questionTv;
        TextView optionARadio;
        TextView optionBRadio;
        TextView optionCRadio;
        TextView optionDRadio;

        public QuizViewHolder(@NonNull final View itemView){
            super(itemView);
            questionNumberTv = itemView.findViewById(R.id.question_number);
            questionTv = itemView.findViewById(R.id.question_tv);
            optionARadio = itemView.findViewById(R.id.radio1);
            optionBRadio = itemView.findViewById(R.id.radio2);
            optionCRadio = itemView.findViewById(R.id.radio3);
            optionDRadio = itemView.findViewById(R.id.radio4);
        }

}
