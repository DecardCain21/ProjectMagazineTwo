package com.marat.hvatit.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView packman;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int widthPixels = metrics.widthPixels;
        int heightPixels = metrics.heightPixels;
        Log.e("widthPixels",""+widthPixels);
        packman = findViewById(R.id.packman);
        packman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*packman.setX(0);
                packman.setY(1328);*/
                //Global Y = 1328
                switch (position) {
                    case 0:
                        packman.animate().translationXBy(780).setDuration(3000);
                        position = 1;
                        break;
                    case 1:
                        packman.animate().translationY(-1328).setDuration(3000);
                        position = 2;
                        break;
                    case 2:
                        packman.animate().translationXBy(-780).setDuration(3000);
                        position = 3;
                        break;
                    case 3:
                        packman.animate().translationY(0).setDuration(3000);
                        position = 0;
                        break;
                }
                //Log.e("Global Position",""+packman.getLeft()+packman.getTranslationX()+"/"+packman.getTop()+packman.getTranslationY());
                Log.e("Gglobal Position",""+packman.getX()+"/"+packman.getY());
                //Log.e("position","!----------------------!");
                Log.e("Vertical position",""+packman.getTranslationY());
                Log.e("Horizontal position",""+packman.getTranslationX());
                Log.e("X position",""+packman.getPivotX());
                //Log.e("#position",".........................");
            }

        });

    }

    /*public void erasePackman(View view) {
        ImageView packman = findViewById(R.id.packman);
    }*/
}