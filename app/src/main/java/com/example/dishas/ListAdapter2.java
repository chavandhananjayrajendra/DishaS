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

public class ListAdapter2 extends ArrayAdapter<ListData> {
    public ListAdapter2(@NonNull Context context, ArrayList<ListData> dataArrayList) {
        super(context, R.layout.list_item, dataArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ListData listData2 = getItem(position);
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item2, parent, false);
        }
        ImageView listImage2 = view.findViewById(R.id.listImage2);
        TextView listName2= view.findViewById(R.id.listName2);

        listImage2.setImageResource(listData2.image);
        listName2.setText(listData2.name);
        return view;
    }
}