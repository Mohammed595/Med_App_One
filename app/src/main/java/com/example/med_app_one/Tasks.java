package com.example.med_app_one;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Tasks extends AppCompatActivity {
    TextView yourTask;

    ImageView imageAddItem ;
    ListView listView ;

    ArrayList <PostTaskToList> tasksList ;

    Adapter_Task adapter_task ;

    PostTaskToList p ;

    final  int req = 1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        yourTask = findViewById(R.id.txYourTasks);

        imageAddItem = findViewById(R.id.imageAdd_var);
        listView = findViewById(R.id.listViewTasks_var);

        tasksList = new ArrayList<>();

        adapter_task = new Adapter_Task( getApplicationContext(), tasksList);

        listView.setAdapter(adapter_task);

        imageAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), AddTask.class);
                startActivityForResult(intent, req);
            }
        });


        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                adapter_task.reomveTask(adapter_task.getItem(position));
                adapter_task.notifyDataSetChanged();
                return false;
            }
        });


        // go to task
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), EditOnTask.class);
                startActivityForResult(intent, 2);

            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == req  && resultCode == RESULT_OK){
            p = (PostTaskToList) data.getSerializableExtra("postToAddTask");

            adapter_task.addTask(p);
            adapter_task.notifyDataSetChanged();

        }else if (requestCode == 2 && resultCode == RESULT_OK){

            String x = (String) data.getSerializableExtra("setTitle");
            p.setTitle(x);
            adapter_task.notifyDataSetChanged();
        }

    }
}