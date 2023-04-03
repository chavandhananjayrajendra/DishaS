package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.dishas.databinding.ActivityD5Binding;
import com.example.dishas.databinding.ActivityD6Binding;

import java.util.ArrayList;

public class d6 extends AppCompatActivity {





    ActivityD6Binding binding;
    ListAdapter listAdapter5;
    ArrayList<ListData> dataArrayList5 = new ArrayList<ListData>();
    ListData listData5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityD6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] image5List = {R.drawable.pension};
        int[] category5List = {R.string.pensioncategory};
        int[] eligibility5List = {R.string.pensioneligibility};
        int[] desc5List = {R.string.pensiondesc};
        int[] benefit5List ={R.string.pensionbenefits};
        int[] apply5List={R.string.pensionapply};
        int[] documents5List={R.string.pensiondocuments};
        int[]link5List={R.string.pensionwithlink};

        String[] name5List = {"INDIRAGANDHIPENSIONSCHEME"};

        for (int i = 0; i < image5List.length; i++){
            listData5 = new ListData(name5List[i],category5List[i],eligibility5List[i],desc5List[i],benefit5List[i],apply5List[i],documents5List[i],link5List[i],image5List[i]);
            dataArrayList5.add(listData5);
        }
        listAdapter5 = new ListAdapter(d6.this, dataArrayList5);
        binding.listview.setAdapter(listAdapter5);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(d6.this, DetailedActivity5.class);
                intent.putExtra("name", name5List[i]);
                intent.putExtra("category",category5List[i]);
                intent.putExtra("eligibility",eligibility5List[i]);
                intent.putExtra("objective", desc5List[i]);
                intent.putExtra("benefits",benefit5List[i]);
                intent.putExtra("apply",apply5List[i]);
                intent.putExtra("documents",documents5List[i]);
                intent.putExtra("link",link5List[i]);
                intent.putExtra("image", image5List[i]);
                startActivity(intent);
            }
        });
    }}
