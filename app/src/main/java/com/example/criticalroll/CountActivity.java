package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CountActivity extends AppCompatActivity {
    private TextView word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.shared_prefs_key), Context.MODE_PRIVATE);
        int defaultValue = getResources().getInteger(R.integer.saved_times_pressed_default_key);
        int clicks = sharedPref.getInt(getString(R.string.saved_button_press_count_key), defaultValue);

        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(getString(R.string.saved_button_press_count_key), clicks);
        editor.commit();

        word.setText("You rolled the die " + clicks + " times!");



    }




}
