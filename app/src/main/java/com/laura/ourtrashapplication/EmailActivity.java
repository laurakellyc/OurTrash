package com.laura.ourtrashapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.QuickContactBadge;

public class EmailActivity extends AppCompatActivity {

    ImageButton btOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        btOk = findViewById(R.id.activity_email_bt_ok);

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmailActivity.this, MenuActivity.class));
                finish();
            }
        });
    }
}