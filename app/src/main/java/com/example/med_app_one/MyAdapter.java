package com.example.med_app_one;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    Context context ;
    ArrayList <Post> postArrayList ;
    public MyAdapter (){}
    public MyAdapter(Context context, ArrayList<Post> postArrayList) {
        this.context = context;
        this.postArrayList = postArrayList;
    }

    void addItemInAzkar (Post p) {
        postArrayList.add(p);
    }

    void reomveItemAzkar (Post p) {
        postArrayList.remove(p);
    }

    @Override
    public int getCount() {
        return postArrayList.size();
    }

    @Override
    public Post getItem(int position) {
        return postArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView ;

        if (v== null) {
            v= LayoutInflater.from(context).inflate(R.layout.item_azkar, null, false);
        }

        TextView title = v.findViewById(R.id.titleAzkar);
        TextView des = v.findViewById(R.id.descrptionAzkar);

        Post post = getItem(position);

        title.setText(post.getTitle());
        des.setText(post.getDescription());
        return v;
    }
}
