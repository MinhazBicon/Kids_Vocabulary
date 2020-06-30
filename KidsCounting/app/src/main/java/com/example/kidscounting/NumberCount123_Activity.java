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

public class NumberCount123_Activity extends AppCompatActivity implements View.OnClickListener {
     private ImageButton one,two,three,four,five,six,seven,eight,nine,ten,cross_btn;
     private MediaPlayer sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove notification Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // hide action bar
        getSupportActionBar().hide();

        // always open in Landscape mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // find button
        one = findViewById(R.id.imageButton1);
        two = findViewById(R.id.imageButton2);
        three = findViewById(R.id.imageButton3);
        four = findViewById(R.id.imageButton4);
        five = findViewById(R.id.imageButton5);
        six = findViewById(R.id.imageButton6);
        seven = findViewById(R.id.imageButton7);
        eight = findViewById(R.id.imageButton8);
        nine = findViewById(R.id.imageButton9);
        ten = findViewById(R.id.imageButton10);
        cross_btn = findViewById(R.id.imageButtonX);

        //create mediaPlayer for all sounds
        sound1 = MediaPlayer.create(this,R.raw.one);
        sound2 = MediaPlayer.create(this,R.raw.two);
        sound3 = MediaPlayer.create(this,R.raw.three);
        sound4 = MediaPlayer.create(this,R.raw.four);
        sound5 = MediaPlayer.create(this,R.raw.five);
        sound6 = MediaPlayer.create(this,R.raw.six);
        sound7 = MediaPlayer.create(this,R.raw.seven);
        sound8 = MediaPlayer.create(this,R.raw.eight);
        sound9 = MediaPlayer.create(this,R.raw.nine);
        sound10 = MediaPlayer.create(this,R.raw.ten);

        // set onclick Listener to all button
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        ten.setOnClickListener(this);
        cross_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageButton1 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            one.startAnimation(animation);
           if (sound1 != null){
               sound1.start();
           }
        }

        if (view.getId() == R.id.imageButton2 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            two.startAnimation(animation);
           if (sound2 != null){
              sound2.start();
           }
        }

        if (view.getId() == R.id.imageButton3 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            three.startAnimation(animation);
           if (sound3 != null){
               sound3.start();
           }
        }

        if (view.getId() == R.id.imageButton4 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            four.startAnimation(animation);
           if (sound4 != null){
               sound4.start();
           }
        }

        if (view.getId() == R.id.imageButton5 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            five.startAnimation(animation);
           if (sound5 != null){
               sound5.start();
           }
        }

        if (view.getId() == R.id.imageButton6 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            six.startAnimation(animation);
           if (sound6 != null){
              sound6.start();
           }
        }

        if (view.getId() == R.id.imageButton7 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            seven.startAnimation(animation);
           if (sound7 != null){
               sound7.start();
           }
        }

        if (view.getId() == R.id.imageButton8 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            eight.startAnimation(animation);
           if (sound8 != null){
               sound8.start();
           }
        }

        if (view.getId() == R.id.imageButton9 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            nine.startAnimation(animation);
           if (sound9 != null){
               sound9.start();
           }
        }

        if (view.getId() == R.id.imageButton10 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            ten.startAnimation(animation);
           if (sound10 != null){
               sound10.start();
           }
        }

        if (view.getId() == R.id.imageButtonX){
            Fade_Animation();
            Intent intent = new Intent(NumberCount123_Activity.this,Home_Activities.class);
            startActivity(intent);
            finish();
            }
        }

        public void Fade_Animation(){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.fade);
            cross_btn.startAnimation(animation);
            }
    }
