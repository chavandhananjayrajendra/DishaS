package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.dishas.databinding.ActivityDetailed3Binding;
import com.example.dishas.databinding.ActivityDetailed4Binding;

public class DetailedActivity4 extends AppCompatActivity {


    ActivityDetailed4Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailed4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = this.getIntent();
        if (intent != null) {
            String name4 = intent.getStringExtra("name");
            int category4 = intent.getIntExtra("category", R.string.marriagecategory);
            int eligibility4 = intent.getIntExtra("eligibility", R.string.marriageeligibility);
            int desc4 = intent.getIntExtra("objective", R.string.marriagedesc);
            int benefits4 = intent.getIntExtra("benefits", R.string.marriagebenefits);
            int image4 = intent.getIntExtra("image", R.drawable.marriage);


            binding.detail4Name.setText(name4);
            binding.detail4Category.setText(category4);
            binding.detail4Eligibility.setText(eligibility4);
            binding.detail4Objective.setText(desc4);
            binding.detail4Benefits.setText(benefits4);
            binding.detail4Image.setImageResource(image4);

        }

    }
}