package com.example.med_app_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btncounterEsgfar ;
    ImageView imageCountEstgfar ;

    Button btnAzkar ;
    ImageView imageAzkar ;

    Button btnTasks ;
    ImageView imageTasks ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAzkar = findViewById(R.id.btnAzkar);
        imageAzkar = findViewById(R.id.imageAzlar);

        imageCountEstgfar = findViewById(R.id.imageEstgfar_var);
        btncounterEsgfar = findViewById(R.id.btnCounterAstgfar_var);

        btnTasks = findViewById(R.id.btnTasks_varMain);
        imageTasks = findViewById(R.id.imageTasks);

        btnTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Tasks.class);
                startActivity(intent);
            }
        });

        imageTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Tasks.class);
                startActivity(intent);
            }
        });

        btncounterEsgfar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , CountAstqfar.class);
                startActivity(intent);
            }
        });


        imageAzkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , AzkarAlmsaaAndSba.class);
                startActivity(intent);

            }
        });

        btnAzkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , AzkarAlmsaaAndSba.class);
                startActivity(intent);

            }
        });

    }
}