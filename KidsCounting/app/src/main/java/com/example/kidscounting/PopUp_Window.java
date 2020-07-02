package com.example.kidscounting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.annotation.Nullable;


public class PopUp_Window extends Activity {
    int flag = R.drawable.popup_background;
    private ImageView PopUp;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_window);

        PopUp = findViewById(R.id.PopUp_id);

        PopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Runnable runnable = new Runnable() {
                   @Override
                   public void run() {
                       synchronized (this) {
                           try {
                               wait(300);
                           } catch (InterruptedException e) {
                               e.printStackTrace();
                           }
                       }
                       Intent intent = new Intent(PopUp_Window.this,Puzzle_game_Activity.class);
                       startActivity(intent);
                       finish();
                   }
               };
                runnable.run();
            }
        });

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;
        getWindow().setBackgroundDrawableResource(flag);
        getWindow().setLayout((int) (width*.4),(int) (height*.6));

        //setting the Popup window position
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = 0;
        getWindow().setAttributes(params);

    }
}

