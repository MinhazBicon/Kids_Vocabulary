package com.example.kidscounting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class Home_Activities extends AppCompatActivity implements View.OnClickListener {
     private ImageButton counting123,AppleCount,puzzleGame;
     private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove notification Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_home__activities);

        // hide action bar
        getSupportActionBar().hide();

        // always open in Landscape mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // finding all button
        puzzleGame = findViewById(R.id.puzzle_game_btn);
        counting123 = findViewById(R.id.Counting123_button);
        AppleCount = findViewById(R.id.AppleCount_button);

        // set onClick Listener
        counting123.setOnClickListener(this);
        AppleCount.setOnClickListener(this);
        puzzleGame.setOnClickListener(this);

        // Start_Animation();
        Animation_Runnable.run();

    }


    @Override
    public void onClick(View view) {

        if(view == counting123){
            Intent intent = new Intent(Home_Activities.this, NumberCount123_Activity.class);
            startActivity(intent);
            finish();
        }

        if(view == AppleCount){
            Intent intent = new Intent(Home_Activities.this, AppleCount_Activity.class);
            startActivity(intent);
            finish();
        }
        if(view == puzzleGame){
            Intent intent = new Intent(Home_Activities.this, Puzzle_game_Activity.class);
            startActivity(intent);
            finish();
        }

    }


   public void Start_Animation(){
        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);
        Bounce_animation_Interpolator bounce_animation_interpolator = new Bounce_animation_Interpolator(0.3,15);
        animation.setInterpolator(bounce_animation_interpolator);
        counting123.startAnimation(animation);
        AppleCount.startAnimation(animation);
        puzzleGame.startAnimation(animation);
    }

    private Runnable Animation_Runnable = new Runnable() {
        @Override
        public void run() {
            Start_Animation();
            handler.postDelayed(this,1800);

        }
    };

}