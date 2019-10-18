package com.example.aplikasi_sederhana_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kode2 extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode2);

        back = (Button)findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Kode2.this, Activity2.class);
                startActivity(back);
            }
        });
    }

    public void menu (View v) {
        startActivity(new Intent(Kode2.this, MainActivity.class));
        finish();
    }
}
