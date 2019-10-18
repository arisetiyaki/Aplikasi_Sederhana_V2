package com.example.aplikasi_sederhana_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    Button code3, menu;
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        code3 = (Button)findViewById(R.id.code3);
        menu = (Button)findViewById(R.id.menu);
        link = (TextView)findViewById(R.id.link);

        code3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent code3 = new Intent(Activity3.this, Kode3.class);
                startActivity(code3);
            }
        });


        link.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void back_menu (View v) {
        startActivity(new Intent(Activity3.this, MainActivity.class));
        finish();

    }
}
