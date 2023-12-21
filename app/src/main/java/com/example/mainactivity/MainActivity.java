package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnNext;
    EditText edtma,edtten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = findViewById(R.id.btnNext);
        edtma=findViewById(R.id.editNhapA);
        edtten=findViewById(R.id.editNhapB);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double a = Double.parseDouble(edtma.getText().toString());
                    double b = Double.parseDouble(edtten.getText().toString());

                    // Solving the equation ax + b = 0
                    double solution;
                    if(a != 0) {
                        solution = -b / a;

                        Intent intent = new Intent(MainActivity.this, SubActivity.class);
                        intent.putExtra("SOLUTION", solution); // Passing the solution to SubActivity
                        startActivity(intent);
                    } else {
                        // Handle the case where a = 0
                        Toast.makeText(MainActivity.this, "Invalid equation (a cannot be 0)", Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Invalid input", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}