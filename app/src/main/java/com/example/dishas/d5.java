package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.dishas.databinding.ActivityD4Binding;
import com.example.dishas.databinding.ActivityD5Binding;

import java.util.ArrayList;


public class d5 extends AppCompatActivity {





    ActivityD5Binding binding;
    ListAdapter listAdapter4;
    ArrayList<ListData> dataArrayList4 = new ArrayList<ListData>();
    ListData listData4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityD5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] image4List = {R.drawable.marriage};
        int[] category4List = {R.string.marriagecategory};
        int[] eligibility4List = {R.string.marriageeligibility};
        int[] desc4List = {R.string.marriagedesc};
        int[] benefit4List ={R.string.marriagebenefits};
        int[] apply4List={R.string.marriageapply};
        int[] documents4List={R.string.marriagedocuments};
        int[] link4List={R.string.marriagewithlink};

        int[] name4List = {R.string.marriagename};

        for (int i = 0; i < image4List.length; i++){
            listData4 = new ListData(name4List[i],category4List[i],eligibility4List[i],desc4List[i],benefit4List[i],apply4List[i],documents4List[i],link4List[i],image4List[i]);
            dataArrayList4.add(listData4);
        }
        listAdapter4 = new ListAdapter(d5.this, dataArrayList4);
        binding.listview.setAdapter(listAdapter4);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(d5.this, DetailedActivity4.class);
                intent.putExtra("name", name4List[i]);
                intent.putExtra("category",category4List[i]);
                intent.putExtra("eligibility",eligibility4List[i]);
                intent.putExtra("objective", desc4List[i]);
                intent.putExtra("benefits",benefit4List[i]);
                intent.putExtra("apply",apply4List[i]);
                intent.putExtra("documents",documents4List[i]);
                intent.putExtra("link",link4List[i]);
                intent.putExtra("image", image4List[i]);
                startActivity(intent);
            }
        });
    }
}