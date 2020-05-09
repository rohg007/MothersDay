package com.rohg007.android.mothersday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class QuizAdapter extends RecyclerView.Adapter<QuizViewHolder> {

    private ArrayList<Question> questions;
    private Context context;

    public QuizAdapter(ArrayList<Question> questions, Context context) {
        this.questions = questions;
        this.context = context;
    }

    @NonNull
    @Override
    public QuizViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.quiz_card,parent,false);
        return new QuizViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizViewHolder holder, int position) {
        Question question = questions.get(position);
//        holder.questionNumberTv.setText(position);
        holder.questionTv.setText(question.getQuestion());
        holder.optionARadio.setText(question.getOption1());
        holder.optionBRadio.setText(question.getOption2());
        holder.optionCRadio.setText(question.getOption3());
        holder.optionDRadio.setText(question.getOption4());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }
}
