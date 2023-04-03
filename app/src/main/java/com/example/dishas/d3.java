package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.example.dishas.databinding.ActivityD3Binding;

import java.util.ArrayList;


public class d3 extends AppCompatActivity {



    ActivityD3Binding binding;
    ListAdapter listAdapter2;
    ArrayList<ListData> dataArrayList2 = new ArrayList<ListData>();
    ListData listData2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityD3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] image2List = {R.drawable.special,R.drawable.education2};
        int[] category2List = {R.string.educationcategory,R.string.education2category};
        int[] eligibility2List = {R.string.educationeligibility,R.string.education2eligibility};
        int[] desc2List = {R.string.educationdesc,R.string.education2desc};
        int[] benefit2List ={R.string.educationbenefits,R.string.education2benefits};
        int[] apply2List={R.string.education2apply,R.string.education2apply};
        int[] documents2List={R.string.educationdocuments,R.string.education2documents};
        int[] link2List={R.string.educationwithlink,R.string.educationwithlink1};
        String[] name2List = {"governmenttraining","school"};

        for (int i = 0; i < image2List.length; i++){
            listData2 = new ListData(name2List[i],category2List[i],eligibility2List[i],desc2List[i],benefit2List[i],apply2List[i],documents2List[i],link2List[i],image2List[i]);
            dataArrayList2.add(listData2);
        }
        listAdapter2 = new ListAdapter(d3.this, dataArrayList2);
        binding.listview.setAdapter(listAdapter2);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(d3.this, DetailedActivity2.class);
                intent.putExtra("name", name2List[i]);
                intent.putExtra("category",category2List[i]);
                intent.putExtra("eligibility",eligibility2List[i]);
                intent.putExtra("objective", desc2List[i]);
                intent.putExtra("benefits",benefit2List[i]);
                intent.putExtra("apply",apply2List[i]);
                intent.putExtra("documents",documents2List[i]);
                intent.putExtra("link",link2List);
                intent.putExtra("image", image2List[i]);
                startActivity(intent);
            }
        });
    }
}