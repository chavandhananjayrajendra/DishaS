package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;


import com.example.dishas.databinding.ActivityDetailed2Binding;


public class DetailedActivity2 extends AppCompatActivity {


TextView textView2;
    ActivityDetailed2Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityDetailed2Binding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_detailed2);
        textView2 = findViewById(R.id.textViewLink2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        Intent intent  = this.getIntent();
        if(intent!= null){
            int name2 = intent.getIntExtra("name",R.string.educationname);
            int category2 = intent.getIntExtra("category",R.string.educationcategory);
            int eligibility2 = intent.getIntExtra("eligibility",R.string.educationeligibility);
            int desc2 = intent.getIntExtra("objective",R.string.educationdesc);
            int benefits2 = intent.getIntExtra("benefits",R.string.educationbenefits);
            int apply2 = intent.getIntExtra("apply",R.string.educationapply);
            int documents2 = intent.getIntExtra("documents",R.string.education2documents);
            int link2 = intent.getIntExtra("link",R.string.educationwithlink);
            int image2 = intent.getIntExtra("image",R.drawable.special);


            binding.detail2Name.setText(name2);
            binding.detail2Category.setText(category2);
            binding.detail2Eligibility.setText(eligibility2);
            binding.detail2Objective.setText(desc2);
            binding.detail2Benefits.setText(benefits2);
            binding.detail2Apply.setText(apply2);
            binding.detail2Documents.setText(documents2);
            binding.textViewLink2.setText(link2);
            binding.detail2Image.setImageResource(image2);

        }

    }
}