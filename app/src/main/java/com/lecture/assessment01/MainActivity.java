package com.lecture.assessment01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnLesson1, btnlesson2, btnLesson3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnLesson1 = findViewById(R.id.btnLesson1);
        btnlesson2 = findViewById(R.id.btnLesson2);
        btnLesson3 = findViewById(R.id.btnLesson3);

        btnLesson1.setOnClickListener(v -> {
            Intent intent =
                    new Intent(MainActivity.this,
                            Lesson1Activity.class);
            startActivity(intent);
        });

        btnlesson2.setOnClickListener(v -> {
            Intent intent =
                    new Intent(MainActivity.this,
                            Lesson2Activity.class);
            startActivity(intent);
        });

        btnLesson3.setOnClickListener(v -> {
            Intent intent =
                    new Intent(MainActivity.this,
                            Lesson3Activity.class);
            startActivity(intent);
        });


    }
}