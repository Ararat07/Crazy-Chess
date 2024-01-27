package com.example.crazychessui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public void LaunchTime(View v){
        Intent time = new Intent(this, Time.class);
        startActivity(time);
    }

    public void StartGame(View v){
        Intent game = new Intent(this, Game.class);
        startActivity(game);
    }

    public void LaunchMode(View v){
        Intent mode = new Intent(this, Mode.class);
        startActivity(mode);
    }
}