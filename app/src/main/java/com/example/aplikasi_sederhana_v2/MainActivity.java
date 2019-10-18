package com.example.aplikasi_sederhana_v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button acc1,acc2,acc3,acc4,acc5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acc1 = (Button) findViewById(R.id.acc1);
        acc2 = (Button) findViewById(R.id.acc2);
        acc3 = (Button) findViewById(R.id.acc3);
        acc4 = (Button) findViewById(R.id.acc4);
        acc5 = (Button) findViewById(R.id.acc5);

        acc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acc1 = new Intent(MainActivity.this, Activity1.class);
                startActivity(acc1);
            }
        });

        acc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acc2 = new Intent(MainActivity.this, Activity2.class);
                startActivity(acc2);
            }
        });

        acc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acc3 = new Intent(MainActivity.this, Activity3.class);
                startActivity(acc3);
            }
        });

        acc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acc4 = new Intent(MainActivity.this, Activity4.class);
                startActivity(acc4);
            }
        });

        acc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acc5 = new Intent(MainActivity.this, Activity5.class);
                startActivity(acc5);
            }
        });
    }
}

