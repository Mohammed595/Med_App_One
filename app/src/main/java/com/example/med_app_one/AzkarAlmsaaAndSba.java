package com.example.med_app_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AzkarAlmsaaAndSba extends AppCompatActivity {

    Button btnAzkarMsaa ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar_almsaa_and_sba);

        btnAzkarMsaa = findViewById(R.id.btnAzkarInAzkr);

        btnAzkarMsaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AzkarAlmsaaAndSba.this, ViewAzkarMsaa.class);
                startActivity(intent);
            }
        });

    }
}