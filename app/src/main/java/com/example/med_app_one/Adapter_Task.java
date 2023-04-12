package com.example.med_app_one;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adapter_Task extends BaseAdapter {

    Context context ;
    ArrayList<PostTaskToList> postArrayList ;
    public Adapter_Task (){}
    public Adapter_Task(Context context, ArrayList<PostTaskToList> postArrayList) {
        this.context = context;
        this.postArrayList = postArrayList;
    }
    //
    void addTask (PostTaskToList p) {
        postArrayList.add(p);
    }

    void reomveTask (PostTaskToList p) {
        postArrayList.remove(p);
    }

    //


    @Override
    public int getCount() {
        return postArrayList.size() ;
    }

    @Override
    public PostTaskToList getItem(int position) {
        return postArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView ;

        if (v == null){
            v= LayoutInflater.from(context).inflate(R.layout.item_task_layout, null, false);
        }

        TextView title = v.findViewById(R.id.outputTitleForTask_var);
        TextView dis = v.findViewById(R.id.outputDiscriptionForTask_var);

        PostTaskToList task = postArrayList.get(position);

        title.setText(task.getTitle());
        dis.setText(task.getDiscrption());

        return v;
    }
}
