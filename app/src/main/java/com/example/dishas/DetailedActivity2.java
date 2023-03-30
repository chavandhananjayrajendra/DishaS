package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.dishas.databinding.ActivityDetailed2Binding;


public class DetailedActivity2 extends AppCompatActivity {



    ActivityDetailed2Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailed2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent  = this.getIntent();
        if(intent!= null){
            String name2 = intent.getStringExtra("name");
            int category2 = intent.getIntExtra("category",R.string.educationcategory);
            int eligibility2 = intent.getIntExtra("eligibility",R.string.educationeligibility);
            int desc2 = intent.getIntExtra("objective",R.string.educationdesc);
            int benefits2 = intent.getIntExtra("benefits",R.string.educationbenefits);
            int image2 = intent.getIntExtra("image",R.drawable.special);


            binding.detail2Name.setText(name2);
            binding.detail2Category.setText(category2);
            binding.detail2Eligibility.setText(eligibility2);
            binding.detail2Objective.setText(desc2);
            binding.detail2Benefits.setText(benefits2);
            binding.detail2Image.setImageResource(image2);

        }

    }
}