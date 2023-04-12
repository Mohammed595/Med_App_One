package com.example.med_app_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddTask extends AppCompatActivity {

    EditText title ;
    EditText dis ;

    Button btnSaveTask ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        title = findViewById(R.id.edWriteTitleTask_var);
        dis = findViewById(R.id.edWriteDiscriptionTask_var);

        btnSaveTask = findViewById(R.id.btnSaveTaskInAddTask_var);

        btnSaveTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String varTitle = title.getText().toString();
                String varDis = dis.getText().toString();

                PostTaskToList p = new PostTaskToList(varTitle, varDis);

                Intent intent = new Intent();
                intent.putExtra("postToAddTask", p);

                setResult(RESULT_OK, intent);
                finish();

            }
        });

    }
}