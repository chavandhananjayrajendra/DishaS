package com.example.dishas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter1 extends ArrayAdapter<ListData> {
    public ListAdapter1(@NonNull Context context, ArrayList<ListData> dataArrayList) {
        super(context, R.layout.list_item, dataArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ListData listData1 = getItem(position);
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item1, parent, false);
        }
        ImageView listImage1 = view.findViewById(R.id.listImage1);
        TextView listName1= view.findViewById(R.id.listName1);

        listImage1.setImageResource(listData1.image);
        listName1.setText(listData1.name);
        return view;
    }
}