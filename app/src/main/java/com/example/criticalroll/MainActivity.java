package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private TextView critHit;
    private Random rng =  new Random();
    private FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();

                SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);

                int defaultValue = getResources().getInteger(R.integer.saved_times_pressed_default_key);
                int clicks = sharedPref.getInt(getString(R.string.saved_button_press_count_key), defaultValue);

                clicks++;

                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("howMany", clicks);
                editor.commit();


            }

        });

        floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CountActivity.class));
            }
        });
    }

    private void rollDice(){
        int randomNumber = rng.nextInt(20) + 1;


        switch(randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.one);
                critHit.setText(R.string.critical_h);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.two);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.three);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.four);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.five);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.six);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.seven);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.eight);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.nine);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.ten);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.eleven);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.twelve);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.thirteen);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.fourteen);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.fifthteen);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.sixteen);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.seventeen);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.eightteen);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.nineteen);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.twenty);
                critHit.setText(R.string.critical_h);
                break;
        }
    }


}
