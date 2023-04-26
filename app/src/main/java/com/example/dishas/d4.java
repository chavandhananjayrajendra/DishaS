package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.dishas.databinding.ActivityD3Binding;
import com.example.dishas.databinding.ActivityD4Binding;

import java.util.ArrayList;

public class d4 extends AppCompatActivity {





    ActivityD4Binding binding;
    ListAdapter listAdapter3;
    ArrayList<ListData> dataArrayList3 = new ArrayList<ListData>();
    ListData listData3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityD4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int[] name3List = {R.string.homename};
        int[] image3List = {R.drawable.shelter};
        int[] category3List = {R.string.homecategory};
        int[] eligibility3List = {R.string.homeligibility};
        int[] desc3List = {R.string.homedesc};
        int[] benefit3List ={R.string.homebenefits};
        int[] apply3List={R.string.homeapply};
        int[] documents3List={R.string.homedocuments};
        int[] link3List={R.string.homewithlink};



        for (int i = 0; i < image3List.length; i++){
            listData3 = new ListData(name3List[i],category3List[i],eligibility3List[i],desc3List[i],benefit3List[i],apply3List[i],documents3List[i],link3List[i],image3List[i]);
            dataArrayList3.add(listData3);
        }
        listAdapter3 = new ListAdapter(d4.this, dataArrayList3);
        binding.listview.setAdapter(listAdapter3);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(d4.this, DetailedActivity3.class);
                intent.putExtra("name", name3List[i]);
                intent.putExtra("category",category3List[i]);
                intent.putExtra("eligibility",eligibility3List[i]);
                intent.putExtra("objective", desc3List[i]);
                intent.putExtra("benefits",benefit3List[i]);
                intent.putExtra("apply",apply3List[i]);
                intent.putExtra("documents",documents3List[i]);
                intent.putExtra("link",link3List[i]);

                intent.putExtra("image", image3List[i]);
                startActivity(intent);
            }
        });
    }
}