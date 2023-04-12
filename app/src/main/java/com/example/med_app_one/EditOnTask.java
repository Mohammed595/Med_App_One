package com.example.med_app_one;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditOnTask extends AppCompatActivity {

    TextView getTitle ;
    EditText edTitle;
    Button btnEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_on_task);

        getTitle = findViewById(R.id.getTitle);
        btnEdit = findViewById(R.id.btnEdSave);
        edTitle = findViewById(R.id.edTitle);


        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = edTitle.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("setTitle", x);

                setResult(RESULT_OK, intent);
                finish();

            }
        });




    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        PostTaskToList p ;
//
//        if (requestCode == 2 && resultCode == RESULT_OK){
//            p = (PostTaskToList) data.getSerializableExtra("getPost");
//
//            getTitle.setText(p.getTitle());
//        }


//    }
}