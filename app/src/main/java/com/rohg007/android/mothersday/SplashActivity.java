package com.rohg007.android.mothersday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private ImageView container;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        container = findViewById(R.id.splash_image_view);
        container.setBackgroundResource(R.drawable.splash_animation);

        animationDrawable = (AnimationDrawable) container.getBackground();
    }

    @Override
    protected void onResume() {
        super.onResume();
        animationDrawable.start();
        checkAnimationStatus(150, animationDrawable);
    }

    private void checkAnimationStatus(int time, AnimationDrawable animationDrawable) {
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            if (animationDrawable.getCurrent() != animationDrawable.getFrame(animationDrawable.getNumberOfFrames() - 1))
                checkAnimationStatus(time, animationDrawable);
            else{
                Intent intent = new Intent(SplashActivity.this, TaskActivity.class);
                startActivity(intent);
                finish();}
        }, time);
    }
}
