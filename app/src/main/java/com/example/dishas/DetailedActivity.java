package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dishas.databinding.ActivityDetailedBinding;

public class DetailedActivity extends AppCompatActivity {
    ActivityDetailedBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent  = this.getIntent();
        if(intent!= null){
            String name = intent.getStringExtra("name");
            int category = intent.getIntExtra("category",R.string.financecategory);
            int eligibility = intent.getIntExtra("eligibility",R.string.financeeligibility);
            int desc = intent.getIntExtra("objective",R.string.financeDesc);
            int benefits = intent.getIntExtra("benefits",R.string.financebenefits);
            int image = intent.getIntExtra("image",R.drawable.finance);


       binding.detailName.setText(name);
       binding.detailCategory.setText(category);
       binding.detailEligibility.setText(eligibility);
       binding.detailObjective.setText(desc);
       binding.detailBenefits.setText(benefits);
       binding.detailImage.setImageResource(image);

        }

    }
}