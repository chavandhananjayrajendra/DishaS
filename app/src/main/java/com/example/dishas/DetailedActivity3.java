package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dishas.databinding.ActivityDetailed2Binding;
import com.example.dishas.databinding.ActivityDetailed3Binding;

public class DetailedActivity3 extends AppCompatActivity {





    ActivityDetailed3Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailed3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent  = this.getIntent();
        if(intent!= null){
            String name3 = intent.getStringExtra("name");
            int category3 = intent.getIntExtra("category",R.string.homecategory);
            int eligibility3 = intent.getIntExtra("eligibility",R.string.homeligibility);
            int desc3 = intent.getIntExtra("objective",R.string.homedesc);
            int benefits3 = intent.getIntExtra("benefits",R.string.homebenefits);
            int image3 = intent.getIntExtra("image",R.drawable.shelter);


            binding.detail3Name.setText(name3);
            binding.detail3Category.setText(category3);
            binding.detail3Eligibility.setText(eligibility3);
            binding.detail3Objective.setText(desc3);
            binding.detail3Benefits.setText(benefits3);
            binding.detail3Image.setImageResource(image3);

        }

    }
}