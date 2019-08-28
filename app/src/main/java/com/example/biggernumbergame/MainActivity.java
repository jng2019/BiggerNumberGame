package com.example.biggernumbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonLeft;
    private Button buttonRight;
    private TextView textView_Main_Score;
    private BiggerNumberGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        game = new BiggerNumberGame(0, 1000);
        updateGameDisplay();
    }

    private void updateGameDisplay() {
        //set the text of each button
        //set the text of the score
        buttonLeft.setText(String.valueOf(game.getNumber_left()));
        buttonRight.setText(String.valueOf(game.getNumber_right()));
        textView_Main_Score.setText(String.valueOf(game.getScore()));


    }


    private void setListeners() {
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer = Integer.parseInt(buttonLeft.getText().toString());
                String message = game.checkAnswer(answer);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                game.generateRandomNumber();
                updateGameDisplay();
            }
        });
        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer = Integer.parseInt(buttonRight.getText().toString());
                String message = game.checkAnswer(answer);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                game.generateRandomNumber();
                updateGameDisplay();
            }
        });

    }
    //creating an Anonymous Inner Class that implements View.OnclickListener
    //overiding the one abstract method onClickView
    private void wireWidgets() {
        buttonLeft = findViewById(R.id.button_main_left);
        buttonRight = findViewById(R.id.button_main_right);
        textView_Main_Score = findViewById(R.id.textView_main_Score);
    }
}
