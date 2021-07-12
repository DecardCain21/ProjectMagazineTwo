package com.example.projectmagazine;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button butone;
    Button buttwo;
    Button butthree;
    Button butfour;
    Button butfive;
    Button butsix;
    Button butseven;
    Button buteight;
    Button butnine;
    Button clear;
    Button back;
    Button pay;
    LinearLayout llpagetwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Нахожу view элементы по id и присваиваю
        butone = (Button) findViewById(R.id.button9);
        buttwo = (Button) findViewById(R.id.button10);
        butthree = (Button) findViewById(R.id.button11);
        butfour = (Button) findViewById(R.id.button12);
        butfive = (Button) findViewById(R.id.button13);
        butsix = (Button) findViewById(R.id.button14);
        butseven = (Button) findViewById(R.id.button15);
        buteight = (Button) findViewById(R.id.button16);
        butnine = (Button) findViewById(R.id.button17);
        clear = (Button) findViewById(R.id.clear);
        back = (Button) findViewById(R.id.back);
        pay = (Button) findViewById(R.id.pay);
        ImageView logo = (ImageView) findViewById(R.id.imageView7);
        LinearLayout llpagetwo = (LinearLayout) findViewById(R.id.llpagetwo);
        //Присваиваю данным кнопкам обработчики
        butone.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "120$", Toast.LENGTH_SHORT).show();
            }
        });
        buttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "135$", Toast.LENGTH_SHORT).show();
            }
        });
        butthree.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "123$", Toast.LENGTH_SHORT).show();
                logo.setImageDrawable(getDrawable(R.drawable.mmhunt));
            }
        });
        butfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "200$", Toast.LENGTH_SHORT).show();
            }
        });
        butfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "50$", Toast.LENGTH_SHORT).show();
            }
        });
        butsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "50$", Toast.LENGTH_SHORT).show();
            }
        });
        butseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "96$", Toast.LENGTH_SHORT).show();
            }
        });
        buteight.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "110$", Toast.LENGTH_SHORT).show();
                logo.setImageDrawable(getDrawable(R.drawable.pwar));
            }
        });
        butnine.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "85$", Toast.LENGTH_SHORT).show();
                logo.setImageDrawable(getDrawable(R.drawable.bmhunt));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                logo.setImageDrawable(getDrawable(R.drawable.logo));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llpagetwo.setVisibility(View.INVISIBLE);
            }
        });

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llpagetwo.setVisibility(View.VISIBLE);
            }
        });
        //commit
    }
}