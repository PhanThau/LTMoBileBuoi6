package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    Button btnback;
    TextView txtKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        btnback=findViewById(R.id.btnback);
        txtKQ = findViewById(R.id.txtKetQua);
        Intent intent = getIntent();
        double solution = intent.getDoubleExtra("SOLUTION", 0); // Retrieve the solution
        txtKQ.setText("Solution: " + solution);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}