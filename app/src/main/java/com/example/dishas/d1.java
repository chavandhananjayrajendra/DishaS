package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.dishas.databinding.ActivityD1Binding;
import java.util.ArrayList;


public class d1 extends AppCompatActivity {
    ActivityD1Binding binding;
    ListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityD1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int[] nameList = {R.string.financename,R.string.finance2name,R.string.finance3name,R.string.finance4name,R.string.finance5name};
        int[] imageList = {R.drawable.finance1, R.drawable.finance2,R.drawable.finance3,R.drawable.finance2,R.drawable.finance2};
        int[] categoryList = {R.string.financecategory ,R.string.finance2category,R.string.finance3category,R.string.finance4category,R.string.finance5category};
        int[] eligibilityList = {R.string.financeeligibility,R.string.finance2eligibility,R.string.finance3eligibility,R.string.finance4eligibility,R.string.finance5eligibility};
        int[] descList = {R.string.financeDesc,R.string.finance2Desc,R.string.finance3Desc,R.string.finance4Desc,R.string.finance5Desc};
        int[] benefitList ={R.string.financebenefits,R.string.finance2benefits,R.string.finance3benefits,R.string.finance4benefits,R.string.finance5benefits};
        int[] applyList ={R.string.financeapply,R.string.finance2apply,R.string.finance3apply,R.string.finance4apply,R.string.finance5apply};
        int[] documentsList = {R.string.financedocuments,R.string.finance2documents,R.string.finance3documents,R.string.finance4documents,R.string.finance5documents};
        int[] linkList = {R.string.financewithlink,R.string.financewithlink1,R.string.financewithlink1,R.string.financewithlink1,R.string.financewithlink1};

        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(nameList[i],categoryList[i],eligibilityList[i],descList[i],benefitList[i],applyList[i],documentsList[i],linkList[i],imageList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new ListAdapter(d1.this,dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(d1.this, DetailedActivity.class);

                intent.putExtra("name", nameList[i]);
                intent.putExtra("category",categoryList[i]);
                intent.putExtra("eligibility",eligibilityList[i]);
                intent.putExtra("objective", descList[i]);
                intent.putExtra("benefits",benefitList[i]);
                intent.putExtra("apply",applyList[i]);
                intent.putExtra("documents",documentsList[i]);
                intent.putExtra("link",linkList[i]);
                intent.putExtra("image", imageList[i]);
                startActivity(intent);
            }
        });
    }
}