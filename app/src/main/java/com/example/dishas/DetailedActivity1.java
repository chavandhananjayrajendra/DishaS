package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dishas.databinding.ActivityDetailed1Binding;
import com.example.dishas.databinding.ActivityDetailedBinding;

public class DetailedActivity1 extends AppCompatActivity {
    ActivityDetailed1Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailed1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent  = this.getIntent();
        if(intent!= null){
            String name1 = intent.getStringExtra("name");
            int category1 = intent.getIntExtra("category",R.string.loancategory);
            int eligibility1 = intent.getIntExtra("eligibility",R.string.loaneligibility);
            int desc1 = intent.getIntExtra("objective",R.string.loandesc);
            int benefits1 = intent.getIntExtra("benefits",R.string.loanbenefits);
            int image1 = intent.getIntExtra("image",R.drawable.loan);


            binding.detail1Name.setText(name1);
            binding.detail1Category.setText(category1);
            binding.detail1Eligibility.setText(eligibility1);
            binding.detail1Objective.setText(desc1);
            binding.detail1Benefits.setText(benefits1);
            binding.detail1Image.setImageResource(image1);

        }

    }
}