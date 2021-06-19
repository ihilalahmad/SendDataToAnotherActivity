package com.example.sendingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);

        String name = getIntent().getStringExtra("name");
        int age = getIntent().getIntExtra("age", 0);

        tvName.setText(name);
        tvAge.setText(String.valueOf(age));

    }
}