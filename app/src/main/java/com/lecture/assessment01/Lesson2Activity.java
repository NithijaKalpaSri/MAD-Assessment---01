package com.lecture.assessment01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lesson2Activity extends AppCompatActivity {

    EditText etName, etEmail, etMobile;
    Button btnSubmit, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson2);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etMobile = findViewById(R.id.etMobile);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnClear = findViewById(R.id.btnClear);

        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String email = etEmail.getText().toString();
            String mobile = etMobile.getText().toString();

            if(name.isEmpty()){
                etName.setError("Enter Name");
                return;
            }

            if(email.isEmpty()){
                etEmail.setError("Enter Email");
                return;
            }

            if(mobile.isEmpty()){
                etMobile.setError("Enter Mobile");
                return;
            }
            Intent intent =
                    new Intent(
                            Lesson2Activity.this,
                            DsiaplayActivity.class);

            intent.putExtra("name",name);
            intent.putExtra("email",email);
            intent.putExtra("mobile",mobile);

            startActivity(intent);

        });
        btnClear.setOnClickListener(v -> {
            etName.setText("");
            etEmail.setText("");
            etMobile.setText("");
        });
    }
}