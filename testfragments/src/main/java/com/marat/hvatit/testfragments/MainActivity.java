package com.marat.hvatit.testfragments;

import androidx.annotation.NonNull;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


import layout.FragmentOne;
import layout.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG","onCreate");

    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        Log.e("TAG","onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
    }

    public void change(View view) {
        Fragment fragment = new FragmentOne();
        switch (view.getId()) {
            case R.id.button:
                fragment = new FragmentOne();
                break;
            case R.id.button2:
                fragment = new FragmentTwo();
                break;
        }

       getSupportFragmentManager().beginTransaction()
        .replace(R.id.fr_place,fragment)
        .commit();
    }

}