package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import com.example.dishas.databinding.ActivityD2Binding;
import java.util.ArrayList;


public class d2 extends AppCompatActivity {
    ActivityD2Binding binding;
    ListAdapter listAdapter1;
    ArrayList<ListData> dataArrayList1 = new ArrayList<ListData>();
    ListData listData1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityD2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] image1List = {R.drawable.loan};
        int[] category1List = {R.string.loancategory};
        int[] eligibility1List = {R.string.loaneligibility};
        int[] desc1List = {R.string.loandesc};
        int[] benefit1List ={R.string.loanbenefits};
        int[] apply1List={R.string.loanapply};
        int[] documents1List={R.string.loandocuments};
        int[] link1List = {R.string.loanwithlink};

        int[] name1List = {R.string.loanname};

        for (int i = 0; i < image1List.length; i++){
            listData1 = new ListData(name1List[i],category1List[i],eligibility1List[i],desc1List[i],benefit1List[i],apply1List[i],documents1List[i],link1List[i],image1List[i]);
            dataArrayList1.add(listData1);
        }
        listAdapter1 = new ListAdapter(d2.this, dataArrayList1);
        binding.listview.setAdapter(listAdapter1);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(d2.this, DetailedActivity1.class);
                intent.putExtra("name", name1List[i]);
                intent.putExtra("category",category1List[i]);
                intent.putExtra("eligibility",eligibility1List[i]);
                intent.putExtra("objective", desc1List[i]);
                intent.putExtra("benefits",benefit1List[i]);
                intent.putExtra("apply",apply1List[i]);
                intent.putExtra("documents",documents1List[i]);
                intent.putExtra("link",link1List[i]);
                intent.putExtra("image", image1List[i]);
                startActivity(intent);
            }
        });
    }
}