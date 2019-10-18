package com.example.aplikasi_sederhana_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    Button code4, menu;
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        code4 = (Button)findViewById(R.id.code4);
        menu = (Button)findViewById(R.id.menu);
        link = (TextView)findViewById(R.id.link);

        code4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent code4 = new Intent(Activity4.this, Kode4.class);
                startActivity(code4);
            }
        });


        link.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void back_menu (View v) {
        startActivity(new Intent(Activity4.this, MainActivity.class));
        finish();

    }
}
