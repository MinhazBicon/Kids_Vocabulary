package com.example.kidscounting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class Puzzle_game_Activity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton cross_btn, repeat_sound,puzzle_btn1,puzzle_btn2,puzzle_btn3;
    private MediaPlayer mp1, mp2, mp3, mp4,mp5,mp6,mp7,mp8,mp9,mp10,mpNo,mpWin;
    private int state;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove notification Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_puzzle_game);
        // hide action bar
        getSupportActionBar().hide();
        // always open in Landscape mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //find all the button
        puzzle_btn1 = findViewById(R.id.puzzle_1_btn);
        puzzle_btn2 = findViewById(R.id.puzzle_2_btn);
        puzzle_btn3 = findViewById(R.id.puzzle_3_btn);
        cross_btn = findViewById(R.id.puzzle_cross_btn);
        repeat_sound = findViewById(R.id.repeat_volume_btn);

        // adding onClick Listener
        puzzle_btn1.setOnClickListener(this);
        puzzle_btn2.setOnClickListener(this);
        puzzle_btn3.setOnClickListener(this);
        cross_btn.setOnClickListener(this);
        repeat_sound.setOnClickListener(this);

        Random_number_generator();
        Puzzle_create();

    }

    @Override
    public void onClick(View view) {
        if (view == cross_btn){
            Fade_Animation();
            Intent intent = new Intent(Puzzle_game_Activity.this,Home_Activities.class);
            startActivity(intent);
            finish();
        }

        if (view == puzzle_btn1){
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.move);
            puzzle_btn1.startAnimation(animation);

            if (state == 1){
                  mpWin = MediaPlayer.create(this,R.raw.winner);
                  mpWin.start();
                  startActivity(new Intent(Puzzle_game_Activity.this, PopUp_Window.class));
            }
            else if (state == 4){
                  mpWin = MediaPlayer.create(this,R.raw.winner);
                  mpWin.start();
                  startActivity(new Intent(Puzzle_game_Activity.this, PopUp_Window.class));
            }
            else if (state == 7){
                  mpWin = MediaPlayer.create(this,R.raw.winner);
                  mpWin.start();
                  startActivity(new Intent(Puzzle_game_Activity.this, PopUp_Window.class));
            }
            else if (state == 10){
                  mpWin = MediaPlayer.create(this,R.raw.winner);
                  mpWin.start();
                  startActivity(new Intent(Puzzle_game_Activity.this, PopUp_Window.class));
            }
            else {
                  mpNo = MediaPlayer.create(this,R.raw.no);
                  mpNo.start();
                  Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_LONG).show();
            }
        }

        if (view == puzzle_btn2){
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.move);
            puzzle_btn2.startAnimation(animation);

            if (state == 2){
                mpWin = MediaPlayer.create(this,R.raw.winner);
                mpWin.start();
                startActivity(new Intent(Puzzle_game_Activity.this, PopUp_Window.class));
            }
            else if (state == 5){
                mpWin = MediaPlayer.create(this,R.raw.winner);
                mpWin.start();
                startActivity(new Intent(Puzzle_game_Activity.this, PopUp_Window.class));
            }
            else if (state == 8) {
                mpWin = MediaPlayer.create(this, R.raw.winner);
                mpWin.start();
                startActivity(new Intent(Puzzle_game_Activity.this, PopUp_Window.class));
            }
            else {
                mp4 = MediaPlayer.create(this,R.raw.no);
                mp4.start();
                Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_SHORT).show();
            }
        }

        if (view == puzzle_btn3){
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.move);
            puzzle_btn3.startAnimation(animation);

            if (state == 3) {
                mpWin = MediaPlayer.create(this, R.raw.winner);
                mpWin.start();
                startActivity(new Intent(Puzzle_game_Activity.this, PopUp_Window.class));
            }
            else if (state == 6) {
                mpWin = MediaPlayer.create(this, R.raw.winner);
                mpWin.start();
                startActivity(new Intent(Puzzle_game_Activity.this, PopUp_Window.class));
            }
            else if (state == 9) {
                mpWin = MediaPlayer.create(this, R.raw.winner);
                mpWin.start();
                startActivity(new Intent(Puzzle_game_Activity.this, PopUp_Window.class));
            }
            else {
                mp4 = MediaPlayer.create(this, R.raw.no);
                mp4.start();
                Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_SHORT).show();
            }
        }

        if (view == repeat_sound){
            Animation animation = AnimationUtils.loadAnimation(this, R.anim.blink);
            repeat_sound.startAnimation(animation);
            Puzzle_create();
        }
    }

    public void Random_number_generator(){
        Random random = new Random();
        state = random.nextInt(10)+1;
    }
    public void Puzzle_create(){
        if (state == 1){
            puzzle_btn1.setImageResource(R.drawable.number_1);
            mp1 = MediaPlayer.create(this,R.raw.one);
            mp1.start();
        }
        if (state == 2){
            puzzle_btn2.setImageResource(R.drawable.number_2);
            mp2 = MediaPlayer.create(this,R.raw.two);
            mp2.start();
        }
        if (state == 3){
            puzzle_btn3.setImageResource(R.drawable.number_3);
            mp3 = MediaPlayer.create(this,R.raw.three);
            mp3.start();
        }
        if (state == 4){
            puzzle_btn1.setImageResource(R.drawable.number_4);
            mp4 = MediaPlayer.create(this,R.raw.four);
            mp4.start();
        }
        if (state == 5){
            puzzle_btn2.setImageResource(R.drawable.number_5);
            mp5 = MediaPlayer.create(this,R.raw.five);
            mp5.start();
        }
        if (state == 6){
            puzzle_btn3.setImageResource(R.drawable.number_6);
            mp6 = MediaPlayer.create(this,R.raw.six);
            mp6.start();
        }
        if (state == 7){
            puzzle_btn1.setImageResource(R.drawable.number_7);
            mp7 = MediaPlayer.create(this,R.raw.seven);
            mp7.start();
        }
        if (state == 8){
            puzzle_btn2.setImageResource(R.drawable.number_8);
            mp8 = MediaPlayer.create(this,R.raw.eight);
            mp8.start();
        }
        if (state == 9){
            puzzle_btn3.setImageResource(R.drawable.number_9);
            mp9 = MediaPlayer.create(this,R.raw.nine);
            mp9.start();
        }
        if (state == 10){
            puzzle_btn1.setImageResource(R.drawable.number_10);
            mp10 = MediaPlayer.create(this,R.raw.ten);
            mp10.start();
        }
    }

    public void Fade_Animation() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade);
        cross_btn.startAnimation(animation);
    }
}