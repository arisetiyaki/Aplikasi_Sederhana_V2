package com.example.aplikasi_sederhana_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    Button code2, menu;
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        code2 = (Button)findViewById(R.id.code2);
        menu = (Button)findViewById(R.id.menu);
        link = (TextView)findViewById(R.id.link);

        code2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent code2 = new Intent(Activity2.this, Kode2.class);
                startActivity(code2);
            }
        });


        link.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void back_menu (View v) {
        startActivity(new Intent(Activity2.this, MainActivity.class));
        finish();

    }
}
