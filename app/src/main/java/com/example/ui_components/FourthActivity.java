package com.example.ui_components;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        ProgressBar circular=(ProgressBar) findViewById(R.id.cirprog);
        ProgressBar horizontal=(ProgressBar) findViewById(R.id.horizontalprog);
        Button next=(Button) findViewById(R.id.nextin4);
        Button prev=(Button) findViewById(R.id.previous);
        Button horizontalProgress=(Button) findViewById(R.id.horprogbtn);
        Button circularProgress=(Button) findViewById(R.id.cirprogbtn);
        horizontalProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                horizontal.setVisibility(View.VISIBLE);
            }
        });
        circularProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circular.setVisibility(View.VISIBLE);
            }
        });
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
        Intent i=new Intent(this,FifthActivity.class);
        startActivity(i);
    }
    void prevActivity(){
        Intent i=new Intent(this,ThirdActivity.class);
        startActivity(i);
    }
}