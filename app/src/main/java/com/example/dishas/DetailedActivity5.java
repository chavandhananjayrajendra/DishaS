package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.dishas.databinding.ActivityDetailed5Binding;

public class DetailedActivity5 extends AppCompatActivity {

TextView textView5;
    ActivityDetailed5Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityDetailed5Binding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_detailed5);
        textView5 = findViewById(R.id.textViewLink5);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        Intent intent = this.getIntent();
        if (intent != null) {
            String name5 = intent.getStringExtra("name");
            int category5 = intent.getIntExtra("category", R.string.pensioncategory);
            int eligibility5 = intent.getIntExtra("eligibility", R.string.pensioneligibility);
            int desc5 = intent.getIntExtra("objective", R.string.pensiondesc);
            int benefits5 = intent.getIntExtra("benefits", R.string.pensionbenefits);

            int apply5 = intent.getIntExtra("apply",R.string.pensionapply);
            int documents5 = intent.getIntExtra("documents",R.string.pensiondocuments);
            int link5=intent.getIntExtra("link",R.string.pensionwithlink);
            int image5 = intent.getIntExtra("image", R.drawable.pension);


            binding.detail5Name.setText(name5);
            binding.detail5Category.setText(category5);
            binding.detail5Eligibility.setText(eligibility5);
            binding.detail5Objective.setText(desc5);
            binding.detail5Benefits.setText(benefits5);
            binding.detail5Apply.setText(apply5);
            binding.detail5Documents.setText(documents5);
            binding.textViewLink5.setText(link5);
            binding.detai5Image.setImageResource(image5);

        }

    }
}