package com.example.projectmagazine;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import model.Hunter;
import model.interfaces.Wowclass;

public class MainActivity extends AppCompatActivity {
    List<Wowclass> listwowclass;


    Button brdruid;
    Button bawar;
    Button bmmhunt;
    Button bfdruid;
    Button bfwar;
    Button blghunt;
    Button bbdruid;
    Button bpwar;
    Button bbmhunt;
    Button clear;
    Button back;
    Button pay;
    Button alternative;

    LinearLayout lloption;
    LinearLayout llpagetwo;
    //Меню
    final int MENU_OPTION_ID = 1;
    final int MENU_QUIT_ID = 2;
    final int MENU_BACK_ID = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Нахожу view элементы по id и присваиваю
        //Нахождение и присвоений элементов списка
        LayoutInflater ltInflater = getLayoutInflater();
        View item = ltInflater.inflate(R.layout.item, llpagetwo, false);
        TextView tvName = (TextView) item.findViewById(R.id.tvClass);
        TextView tvPosition = (TextView) item.findViewById(R.id.tvSpec);
        TextView tvSalary = (TextView) item.findViewById(R.id.tvPrice);


        llpagetwo = (LinearLayout) findViewById(R.id.llpagetwo);
        lloption = (LinearLayout) findViewById(R.id.lloption);
        brdruid = (Button) findViewById(R.id.rdruid);
        bawar = (Button) findViewById(R.id.awar);
        bmmhunt = (Button) findViewById(R.id.mmhunt);
        bfdruid = (Button) findViewById(R.id.fdruid);
        bfwar = (Button) findViewById(R.id.fwar);
        blghunt = (Button) findViewById(R.id.lghunt);
        bbdruid = (Button) findViewById(R.id.bdruid);
        bpwar = (Button) findViewById(R.id.pwar);
        bbmhunt = (Button) findViewById(R.id.bmhunt);
        clear = (Button) findViewById(R.id.clear);
        back = (Button) findViewById(R.id.back);
        pay = (Button) findViewById(R.id.pay);
        alternative = (Button) findViewById(R.id.alternative);
        ImageView logo = (ImageView) findViewById(R.id.imageView7);
        LinearLayout llpagetwo = (LinearLayout) findViewById(R.id.llpagetwo);
        //Присваиваю данным кнопкам обработчики
        brdruid.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "120$", Toast.LENGTH_SHORT).show();
            }
        });
        bawar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "135$", Toast.LENGTH_SHORT).show();
            }
        });
        bmmhunt.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "123$", Toast.LENGTH_SHORT).show();
                logo.setImageDrawable(getDrawable(R.drawable.mmhunt));
                tvName.setText(initMagazine(0).getName());
                tvPosition.setText(initMagazine(0).getSpecialization());
                tvSalary.setText(String.valueOf(initMagazine(0).getPrice()));
                llpagetwo.addView(item);

            }
        });
        bfdruid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "200$", Toast.LENGTH_SHORT).show();
            }
        });
        bfwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "50$", Toast.LENGTH_SHORT).show();
            }
        });
        blghunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "50$", Toast.LENGTH_SHORT).show();
            }
        });
        bbdruid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "96$", Toast.LENGTH_SHORT).show();
            }
        });
        bpwar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "110$", Toast.LENGTH_SHORT).show();
                logo.setImageDrawable(getDrawable(R.drawable.pwar));
            }
        });
        bbmhunt.setOnClickListener(new View.OnClickListener() {
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
        alternative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lloption.setVisibility(View.INVISIBLE);
            }
        });
        //commit
    }

    public Wowclass initMagazine(int i) {
        List<Wowclass> listwowclass = new ArrayList<Wowclass>();
        listwowclass.add((new Hunter("Hunter","MM",123)));
        listwowclass.add((new Hunter("Hunter","MM",85)));
        listwowclass.add((new Hunter("Warrior","Pwar",110)));
        return listwowclass.get(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_OPTION_ID, 0, "Option");
        menu.add(0, MENU_BACK_ID, 0, "Back");
        menu.add(0, MENU_QUIT_ID, 0, "Quit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_OPTION_ID:
                lloption.setVisibility(View.VISIBLE);
                break;
            case MENU_BACK_ID:
                lloption.setVisibility(View.INVISIBLE);
                break;
            case MENU_QUIT_ID:
                // выход из приложения
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}