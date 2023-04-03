package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.dishas.databinding.ActivityDetailed3Binding;
import com.example.dishas.databinding.ActivityDetailed4Binding;

public class DetailedActivity4 extends AppCompatActivity {

TextView textView4;
    ActivityDetailed4Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityDetailed4Binding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_detailed4);
        textView4 = findViewById(R.id.textViewLink4);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        Intent intent = this.getIntent();
        if (intent != null) {
            String name4 = intent.getStringExtra("name");
            int category4 = intent.getIntExtra("category", R.string.marriagecategory);
            int eligibility4 = intent.getIntExtra("eligibility", R.string.marriageeligibility);
            int desc4 = intent.getIntExtra("objective", R.string.marriagedesc);
            int benefits4 = intent.getIntExtra("benefits", R.string.marriagebenefits);
            int apply4 = intent.getIntExtra("apply",R.string.marriageapply);
            int documents4 = intent.getIntExtra("documents",R.string.marriagedocuments);
            int link4 = intent.getIntExtra("link",R.string.marriagewithlink);
            int image4 = intent.getIntExtra("image", R.drawable.marriage);


            binding.detail4Name.setText(name4);
            binding.detail4Category.setText(category4);
            binding.detail4Eligibility.setText(eligibility4);
            binding.detail4Objective.setText(desc4);
            binding.detail4Benefits.setText(benefits4);
            binding.detail4Apply.setText(apply4);
            binding.detail4Documents.setText(documents4);
            binding.textViewLink4.setText(link4);
            binding.detail4Image.setImageResource(image4);

        }

    }
}