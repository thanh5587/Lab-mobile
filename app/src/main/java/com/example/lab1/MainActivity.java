package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Lab 1 - Android Layouts");
        setContentView(R.layout.activity_main_menu);

        Button btn1a = findViewById(R.id.btn_1a);
        Button btn1b = findViewById(R.id.btn_1b);
        Button btn2 = findViewById(R.id.btn_2);
        Button btn3 = findViewById(R.id.btn_3);

        btn1a.setOnClickListener(v ->
                startActivity(new Intent(this, Lab1AActivity.class)));

        btn1b.setOnClickListener(v ->
                startActivity(new Intent(this, Lab1BActivity.class)));

        btn2.setOnClickListener(v ->
                startActivity(new Intent(this, Lab2Activity.class)));

        btn3.setOnClickListener(v ->
                startActivity(new Intent(this, Lab3Activity.class)));
    }
}