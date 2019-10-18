package com.example.aplikasi_sederhana_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    Button code1, menu;
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        code1 = (Button)findViewById(R.id.code1);
        menu = (Button)findViewById(R.id.menu);
        link = (TextView)findViewById(R.id.link);

        code1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent code1 = new Intent(Activity1.this, Kode1.class);
                startActivity(code1);
            }
        });


        link.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void back_menu (View v) {
        startActivity(new Intent(Activity1.this, MainActivity.class));
        finish();

    }
}
