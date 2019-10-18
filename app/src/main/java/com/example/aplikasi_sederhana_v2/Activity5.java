package com.example.aplikasi_sederhana_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    Button code5, menu;
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        code5 = (Button)findViewById(R.id.code5);
        menu = (Button)findViewById(R.id.menu);
        link = (TextView)findViewById(R.id.link);

        code5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent code5 = new Intent(Activity5.this, Kode5.class);
                startActivity(code5);
            }
        });


        link.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void back_menu (View v) {
        startActivity(new Intent(Activity5.this, MainActivity.class));
        finish();

    }
}
