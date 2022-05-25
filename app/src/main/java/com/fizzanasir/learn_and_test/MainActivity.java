package com.fizzanasir.learn_and_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button Learn, Quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Learn=findViewById(R.id.learnbtn);
        Learn.setOnClickListener(this);
        Quiz=findViewById(R.id.quizbtn);
        Quiz.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.learnbtn:
                intent = new Intent(MainActivity.this, Learning.class);
                startActivity(intent);
                break;
            case R.id.quizbtn:
                intent = new Intent(MainActivity.this, Q1.class);
                startActivity(intent);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());

        }
    }
}