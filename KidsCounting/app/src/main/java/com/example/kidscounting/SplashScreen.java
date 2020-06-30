package com.example.kidscounting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove notification Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        // hide action bar
        getSupportActionBar().hide();

        // always open in Landscape mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //find the Progressbar
        progressBar = findViewById(R.id.progress_id);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
             Do_Progress();
             Start_Home_Activities();
            }
        });

        thread.start();
    }

    public void Do_Progress(){
        for (progress=0; progress<=100; progress=progress+10){

         try {
             Thread.sleep(900);
             progressBar.setProgress(progress);

         }catch (InterruptedException e){
             e.printStackTrace();

         }
        }
    }

    public void Start_Home_Activities(){
        Intent intent = new Intent(SplashScreen.this,Home_Activities.class);
        startActivity(intent);
        finish();
    }
}