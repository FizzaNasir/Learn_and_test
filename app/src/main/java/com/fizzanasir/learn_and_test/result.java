package com.fizzanasir.learn_and_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity implements View.OnClickListener {
Button cont;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        cont=findViewById(R.id.cont_learning);
        cont.setOnClickListener(this);
        txt=findViewById(R.id.res);
        Intent in=getIntent();
        int ip= in.getIntExtra("score", 0);
        txt.setText("Your score is: "+ ip+"/5");
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        intent = new Intent(result.this, MainActivity.class);
        startActivity(intent);

    }
}