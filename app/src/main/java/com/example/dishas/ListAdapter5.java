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

public class ListAdapter5 extends ArrayAdapter<ListData> {
    public ListAdapter5(@NonNull Context context, ArrayList<ListData> dataArrayList) {
        super(context, R.layout.list_item, dataArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ListData listData5 = getItem(position);
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item5, parent, false);
        }
        ImageView listImage5 = view.findViewById(R.id.listImage5);
        TextView listName5= view.findViewById(R.id.listName5);

        listImage5.setImageResource(listData5.image);
        listName5.setText(listData5.name);
        return view;
    }
}