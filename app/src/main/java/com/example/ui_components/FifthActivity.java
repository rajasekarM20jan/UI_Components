package com.example.ui_components;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class FifthActivity extends AppCompatActivity {
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        FloatingActionButton plus=(FloatingActionButton) findViewById(R.id.floatingbtn1);
        FloatingActionButton done=(FloatingActionButton) findViewById(R.id.floatingbtn2);
        ImageButton img=(ImageButton) findViewById(R.id.btn3in5);
        Button next=(Button) findViewById(R.id.nextin5);
        Button prev=(Button) findViewById(R.id.previous5);
        ArrayList a=new ArrayList<>();
        a.add(getDrawable(R.drawable.naruto_new));
        a.add(getDrawable(R.drawable.itachi));
        a.add(getDrawable(R.drawable.tobi));
        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                img.setBackground((Drawable) a.get(i));
                if(i<2){
                    i+=1;
                }else{
                    i=0;
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                done.setVisibility(View.VISIBLE);
            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                done.setVisibility(View.GONE);
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
        Intent i=new Intent(this,SixthActivity.class);
        startActivity(i);
    }
    void prevActivity(){
        Intent i=new Intent(this,FourthActivity.class);
        startActivity(i);
    }
}
