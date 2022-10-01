package com.example.ui_components;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button next=(Button) findViewById(R.id.next);
        Button prev=(Button) findViewById(R.id.prev);
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
        Intent i=new Intent(this,FourthActivity.class);
        startActivity(i);
    }
    void prevActivity(){
        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);
    }

}