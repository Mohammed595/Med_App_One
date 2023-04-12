package com.example.med_app_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CountAstqfar extends AppCompatActivity {
    Button btnStart ;
    Button btnRestart ;
    TextView txCount ;

    int count ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_astqfar);
        count = 0 ;
        btnStart = findViewById(R.id.btnStart);
        btnRestart = findViewById(R.id.btnRestart);
        txCount = findViewById(R.id.txCount);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++count;
                txCount.setText(String.valueOf(count));

            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0 ;
                txCount.setText(String.valueOf(count));
            }
        });


    }
}