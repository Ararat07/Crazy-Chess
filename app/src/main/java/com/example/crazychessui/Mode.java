package com.example.crazychessui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Mode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);

        SmallBoard smallBoard = findViewById(R.id.smallerChessboard2);
        smallBoard.setVisibility(View.INVISIBLE);

        //TextView description = findViewById(R.id.textView6);
        //description.setText(R.string.standard_chess_description);
    }

    public void showStandard(View view){
        SmallBoard smallBoard = findViewById(R.id.smallerChessboard2);

        if (smallBoard.getVisibility() == View.VISIBLE) {
            smallBoard.setVisibility(View.INVISIBLE);
        }
    }

    public void showCrazyChess(View view){
        SmallBoard smallBoard = findViewById(R.id.smallerChessboard2);

        if (smallBoard.getVisibility() == View.VISIBLE) {
            smallBoard.setVisibility(View.INVISIBLE);
        }
    }

    public void showSwizz(View view){
        SmallBoard smallBoard = findViewById(R.id.smallerChessboard2);

        if (smallBoard.getVisibility() == View.INVISIBLE) {
            smallBoard.setVisibility(View.VISIBLE);
        }
    }
}