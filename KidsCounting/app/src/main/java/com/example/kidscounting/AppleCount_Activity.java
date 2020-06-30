package com.example.kidscounting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class AppleCount_Activity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButton1, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6,
                        imageButton7, imageButton8, imageButton9, imageButton10, repeat, cross_btn, mute;
    private ImageView AppleShow;
    private MediaPlayer sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9,sound10;
    private int state = 1;
    private int state_repeat =1;
    private ArrayList<MediaPlayer> soundList = new ArrayList<>();
    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove notification Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_apple_count_activity);
        // hide action bar
        getSupportActionBar().hide();
        // always open in Landscape mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // find Image view
        AppleShow = findViewById(R.id.Apple_ImageView);
        //find all button
        imageButton1 = findViewById(R.id.btn_1);
        imageButton2 = findViewById(R.id.btn_2);
        imageButton3 = findViewById(R.id.btn_3);
        imageButton4 = findViewById(R.id.btn_4);
        imageButton5 = findViewById(R.id.btn_5);
        imageButton6 = findViewById(R.id.btn_6);
        imageButton7 = findViewById(R.id.btn_7);
        imageButton8 = findViewById(R.id.btn_8);
        imageButton9 = findViewById(R.id.btn_9);
        imageButton10 = findViewById(R.id.btn_10);
        mute = findViewById(R.id.btn_volume);
        repeat = findViewById(R.id.btn_repeat);
        cross_btn = findViewById(R.id.cross_btn);

        //initialize onClick Listener
        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
        imageButton7.setOnClickListener(this);
        imageButton8.setOnClickListener(this);
        imageButton9.setOnClickListener(this);
        imageButton10.setOnClickListener(this);
        mute.setOnClickListener(this);
        repeat.setOnClickListener(this);
        cross_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == cross_btn){
            Fade_Animation();
            Intent intent = new Intent(AppleCount_Activity.this,Home_Activities.class);
            startActivity(intent);
            finish();
        }

        if (view == imageButton1) {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            imageButton1.startAnimation(animation);
            AppleShow.setImageResource(R.drawable.object_1);
            if (sound1 != null) {
                sound1.start();
            }
        }

        if (view == imageButton2) {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            imageButton2.startAnimation(animation);
            AppleShow.setImageResource(R.drawable.object_2);
            if (sound2 != null) {
                sound2.start();
            }
        }

        if (view == imageButton3) {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            imageButton3.startAnimation(animation);
            AppleShow.setImageResource(R.drawable.object_3);
            if (sound3 != null) {
                sound3.start();
            }
        }

        if (view == imageButton4) {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            imageButton4.startAnimation(animation);
            AppleShow.setImageResource(R.drawable.object_4);
            if (sound4 != null) {
                sound4.start();
            }
        }

        if (view == imageButton5) {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            imageButton5.startAnimation(animation);
            AppleShow.setImageResource(R.drawable.object_5);
            if (sound5 !=null) {
                sound5.start();
            }
            }

        if (view == imageButton6) {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            imageButton6.startAnimation(animation);
            AppleShow.setImageResource(R.drawable.object_6);
                if (sound6 != null) {
                    sound6.start();
                }
            }

        if (view == imageButton7) {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            imageButton7.startAnimation(animation);
            AppleShow.setImageResource(R.drawable.object_7);
                if (sound7 != null) {
                    sound7.start();
                }
            }

        if (view == imageButton8) {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            imageButton8.startAnimation(animation);
            AppleShow.setImageResource(R.drawable.object_8);
                if (sound8 != null) {
                    sound8.start();
                }
            }

        if (view == imageButton9) {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            imageButton9.startAnimation(animation);
            AppleShow.setImageResource(R.drawable.object_9);
                if (sound9 != null) {
                    sound9.start();
                }
            }

        if (view == imageButton10) {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            imageButton10.startAnimation(animation);
            AppleShow.setImageResource(R.drawable.object_10);
                if (sound10 != null) {
                    sound10.start();
                }
            }

        if (view == mute) {
            if(state == 0){
                Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
                mute.startAnimation(animation);
                mute.setImageResource(R.drawable.btn_mute);
              if(sound1==null||sound2==null||sound3==null||sound4==null||sound5==null||sound6==null||sound7==null||sound8==null
                      ||sound9==null||sound10==null){
                  Toast.makeText(getApplicationContext(),"Sound Muted",Toast.LENGTH_SHORT).show();
                  state=state+1;
              }
              else {
                  Toast.makeText(getApplicationContext(),"Sound Muted",Toast.LENGTH_SHORT).show();
                  sound1.stop();
                  sound2.stop();
                  sound3.stop();
                  sound4.stop();
                  sound5.stop();
                  sound6.stop();
                  sound7.stop();
                  sound8.stop();
                  sound9.stop();
                  sound10.stop();
                  state=state+1;}
            }
            else {
                Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
                mute.startAnimation(animation);
                mute.setImageResource(R.drawable.btn_unmute);
                //create mediaPlayer for all sounds
                sound1 = MediaPlayer.create(this, R.raw.one);
                sound2 = MediaPlayer.create(this, R.raw.two);
                sound3 = MediaPlayer.create(this, R.raw.three);
                sound4 = MediaPlayer.create(this, R.raw.four);
                sound5 = MediaPlayer.create(this, R.raw.five);
                sound6 = MediaPlayer.create(this, R.raw.six);
                sound7 = MediaPlayer.create(this, R.raw.seven);
                sound8 = MediaPlayer.create(this, R.raw.eight);
                sound9 = MediaPlayer.create(this, R.raw.nine);
                sound10 = MediaPlayer.create(this, R.raw.ten);
                Toast.makeText(getApplicationContext(),"Sound Unmuted",Toast.LENGTH_SHORT).show();
                state=state-1;
            }
        }

        if (view == repeat){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
            repeat.startAnimation(animation);

            handler.postDelayed(Task1_Runnable,1500);
            handler.postDelayed(Task2_Runnable,3000);
            handler.postDelayed(Task3_Runnable,4500);
            handler.postDelayed(Task4_Runnable,6000);
            handler.postDelayed(Task5_Runnable,7500);
            handler.postDelayed(Task6_Runnable,9000);
            handler.postDelayed(Task7_Runnable,10500);
            handler.postDelayed(Task8_Runnable,12000);
            handler.postDelayed(Task9_Runnable,13500);
            handler.postDelayed(Task10_Runnable,15000);


        }
    }

    public void Fade_Animation(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fade);
        cross_btn.startAnimation(animation);
    }

    private Runnable Task1_Runnable = new Runnable() {
        @Override
        public void run() {
            Task1();
        }
    };
    private Runnable Task2_Runnable = new Runnable() {
        @Override
        public void run() {
            Task2();
        }
    };
    private Runnable Task3_Runnable = new Runnable() {
        @Override
        public void run() {
            Task3();
        }
    };
    private Runnable Task4_Runnable = new Runnable() {
        @Override
        public void run() {
            Task4();
        }
    };
    private Runnable Task5_Runnable = new Runnable() {
        @Override
        public void run() {
            Task5();
        }
    };
    private Runnable Task6_Runnable = new Runnable() {
        @Override
        public void run() {
            Task6();
        }
    };
    private Runnable Task7_Runnable = new Runnable() {
        @Override
        public void run() {
            Task7();
        }
    };
    private Runnable Task8_Runnable = new Runnable() {
        @Override
        public void run() {
            Task8();
        }
    };
    private Runnable Task9_Runnable = new Runnable() {
        @Override
        public void run() {
            Task9();
        }
    };
    private Runnable Task10_Runnable = new Runnable() {
        @Override
        public void run() {
            Task10();
        }
    };

    public void Task1(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageButton1.startAnimation(animation);
        repeat.setEnabled(false);
        AppleShow.setImageResource(R.drawable.object_1);
        if (sound1 != null){
            sound1.start();}
    }
    public void Task2(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageButton2.startAnimation(animation);
        AppleShow.setImageResource(R.drawable.object_2);
        if (sound2 != null){
            sound2.start();}
    }
    public void Task3(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageButton3.startAnimation(animation);
        AppleShow.setImageResource(R.drawable.object_3);
        if (sound3 != null){
            sound3.start();}
    }
    public void Task4(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageButton4.startAnimation(animation);
        AppleShow.setImageResource(R.drawable.object_4);
        if (sound4 != null){
            sound4.start();}
    }
    public void Task5(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageButton5.startAnimation(animation);
        AppleShow.setImageResource(R.drawable.object_5);
        if (sound5 != null){
            sound5.start();}
    }
    public void Task6(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageButton6.startAnimation(animation);
        AppleShow.setImageResource(R.drawable.object_6);
        if (sound6 != null){
            sound6.start();}
    }
    public void Task7(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageButton7.startAnimation(animation);
        AppleShow.setImageResource(R.drawable.object_7);
        if (sound7 != null){
            sound7.start();}
    }
    public void Task8(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageButton8.startAnimation(animation);
        AppleShow.setImageResource(R.drawable.object_8);
        if (sound8 != null){
            sound8.start();}
    }
    public void Task9(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageButton9.startAnimation(animation);
        AppleShow.setImageResource(R.drawable.object_9);
        if (sound9 != null){
            sound9.start();}
    }
    public void Task10(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide);
        imageButton10.startAnimation(animation);
        repeat.setEnabled(true);
        AppleShow.setImageResource(R.drawable.object_10);
        if (sound10 != null){
            sound10.start();}
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(sound1!=null||sound2!=null||sound3!=null||sound4!=null||sound5!=null||sound6!=null||sound7!=null||sound8!=null
                ||sound9!=null||sound10!=null){
        sound1.stop();
        sound2.stop();
        sound3.stop();
        sound4.stop();
        sound5.stop();
        sound6.stop();
        sound7.stop();
        sound8.stop();
        sound9.stop();
        sound10.stop();}


    }
}

