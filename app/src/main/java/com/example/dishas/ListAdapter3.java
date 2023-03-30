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

public class ListAdapter3 extends ArrayAdapter<ListData> {
    public ListAdapter3(@NonNull Context context, ArrayList<ListData> dataArrayList) {
        super(context, R.layout.list_item, dataArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ListData listData3 = getItem(position);
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item3, parent, false);
        }
        ImageView listImage3 = view.findViewById(R.id.listImage3);
        TextView listName3= view.findViewById(R.id.listName3);

        listImage3.setImageResource(listData3.image);
        listName3.setText(listData3.name);
        return view;
    }
}