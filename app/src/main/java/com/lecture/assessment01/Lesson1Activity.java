package com.lecture.assessment01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lesson1Activity extends AppCompatActivity {
    EditText editName;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson1);

        editName = findViewById(R.id.editName);
        btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(v -> {

            String name =
                    editName.getText().toString();

            Toast.makeText(
                    Lesson1Activity.this,
                    "Welcome " + name,
                    Toast.LENGTH_LONG
            ).show();



        });
    }
}