package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Context;
//import android.content.Intent;
//import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private TextView critHit;
    private Random rng =  new Random();
    MediaPlayer missSound;
    MediaPlayer hitSound;
    MediaPlayer diceSound;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        critHit = findViewById(R.id.text_view_crit);
        missSound = MediaPlayer.create(this, R.raw.no);
        hitSound = MediaPlayer.create(this, R.raw.goofy);
        diceSound = MediaPlayer.create(this, R.raw.dice3);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }

        });
    }

    private void rollDice(){
        int randomNumber = rng.nextInt(20) + 1;

        switch(randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.one);
                critHit.setText("CRITICAL MISS");
                missSound.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.two);
                critHit.setText("");
                diceSound.start();
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.three);
                critHit.setText("");
                diceSound.start();
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.four);
                critHit.setText("");
                diceSound.start();
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.five);
                critHit.setText("");
                diceSound.start();
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.six);
                critHit.setText("");
                diceSound.start();
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.seven);
                critHit.setText("");
                diceSound.start();
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.eight);
                critHit.setText("");
                diceSound.start();
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.nine);
                critHit.setText("");
                diceSound.start();
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.ten);
                critHit.setText("");
                diceSound.start();
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.eleven);
                critHit.setText("");
                diceSound.start();
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.twelve);
                critHit.setText("");
                diceSound.start();
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.thirteen);
                critHit.setText("");
                diceSound.start();
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.fourteen);
                critHit.setText("");
                diceSound.start();
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.fifthteen);
                critHit.setText("");
                diceSound.start();
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.sixteen);
                critHit.setText("");
                diceSound.start();
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.seventeen);
                critHit.setText("");
                diceSound.start();
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.eightteen);
                critHit.setText("");
                diceSound.start();
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.nineteen);
                critHit.setText("");
                diceSound.start();
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.twenty);
                critHit.setText("CRITICAL HIT");
                hitSound.start();
                break;
        }
    }


}
