package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.dishas.databinding.ActivityDetailed1Binding;
import com.example.dishas.databinding.ActivityDetailedBinding;

public class DetailedActivity1 extends AppCompatActivity {
    TextView textView1;
    ActivityDetailed1Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed1);
        binding = ActivityDetailed1Binding.inflate(getLayoutInflater());
        textView1 = findViewById(R.id.textViewLink1);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        Intent intent  = this.getIntent();
        if(intent!= null){
            String name1 = intent.getStringExtra("name");
            int category1 = intent.getIntExtra("category",R.string.loancategory);
            int eligibility1 = intent.getIntExtra("eligibility",R.string.loaneligibility);
            int desc1 = intent.getIntExtra("objective",R.string.loandesc);
            int benefits1 = intent.getIntExtra("benefits",R.string.loanbenefits);
            int apply1 = intent.getIntExtra("apply",R.string.loanapply);
            int documents1 = intent.getIntExtra("documents",R.string.loandocuments);
            int link1 = intent.getIntExtra("link",R.string.loanwithlink);
            int image1 = intent.getIntExtra("image",R.drawable.loan);


            binding.detail1Name.setText(name1);
            binding.detail1Category.setText(category1);
            binding.detail1Eligibility.setText(eligibility1);
            binding.detail1Objective.setText(desc1);
            binding.detail1Benefits.setText(benefits1);
            binding.detail1Apply.setText(apply1);
            binding.detail1Documents.setText(documents1);
            binding.textViewLink1.setText(link1);
            binding.detail1Image.setImageResource(image1);

        }

    }
}