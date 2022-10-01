package com.example.ui_components;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button next=(Button) findViewById(R.id.buttonnxt_page2);
        Button prev=(Button) findViewById(R.id.buttonprev_page2);
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
        Intent i=new Intent(this,ThirdActivity.class);
        startActivity(i);
    }
    void prevActivity(){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}