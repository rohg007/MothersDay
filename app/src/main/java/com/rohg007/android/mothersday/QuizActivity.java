package com.rohg007.android.mothersday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.rohg007.android.mothersday.Question;
import android.os.Bundle;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        RecyclerView quizRv = findViewById(R.id.quiz_rv);
        QuizAdapter quizAdapter = new QuizAdapter(Question.getQuestions(),this);
        quizRv.setLayoutManager(new LinearLayoutManager(this));
        quizRv.setAdapter(quizAdapter);
    }
}
