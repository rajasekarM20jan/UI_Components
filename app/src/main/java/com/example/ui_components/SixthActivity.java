package com.example.ui_components;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.ArrayList;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        DatePicker date= (DatePicker) findViewById(R.id.calendar);
        Button next=(Button) findViewById(R.id.nextin6);
        Button prev=(Button) findViewById(R.id.previous6);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity();
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prevActivity();
            }
        });

    }
    void nextActivity(){
        Intent i=new Intent(this,LastActivity.class);
        startActivity(i);
    }
    void prevActivity(){
        Intent i=new Intent(this,FifthActivity.class);
        startActivity(i);
    }
}