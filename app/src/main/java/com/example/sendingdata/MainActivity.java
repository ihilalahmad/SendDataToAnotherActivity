package com.example.sendingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etAge;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(view -> {

            String name = etName.getText().toString();
            int age = Integer.parseInt(etAge.getText().toString());

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("age", age);
            startActivity(intent);
        });

    }
}