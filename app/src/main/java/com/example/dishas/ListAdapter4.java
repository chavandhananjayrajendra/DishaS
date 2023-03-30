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

public class ListAdapter4 extends ArrayAdapter<ListData> {
    public ListAdapter4(@NonNull Context context, ArrayList<ListData> dataArrayList) {
        super(context, R.layout.list_item, dataArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ListData listData4 = getItem(position);
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item4, parent, false);
        }
        ImageView listImage4 = view.findViewById(R.id.listImage4);
        TextView listName4= view.findViewById(R.id.listName4);

        listImage4.setImageResource(listData4.image);
        listName4.setText(listData4.name);
        return view;
    }
}