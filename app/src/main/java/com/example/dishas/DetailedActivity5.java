package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dishas.databinding.ActivityDetailed5Binding;

public class DetailedActivity5 extends AppCompatActivity {


    ActivityDetailed5Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailed5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = this.getIntent();
        if (intent != null) {
            String name5 = intent.getStringExtra("name");
            int category5 = intent.getIntExtra("category", R.string.pensioncategory);
            int eligibility5 = intent.getIntExtra("eligibility", R.string.pensioneligibility);
            int desc5 = intent.getIntExtra("objective", R.string.pensiondesc);
            int benefits5 = intent.getIntExtra("benefits", R.string.pensionbenefits);
            int image5 = intent.getIntExtra("image", R.drawable.pension);


            binding.detail5Name.setText(name5);
            binding.detail5Category.setText(category5);
            binding.detail5Eligibility.setText(eligibility5);
            binding.detail5Objective.setText(desc5);
            binding.detail5Benefits.setText(benefits5);
            binding.detai5Image.setImageResource(image5);

        }

    }
}