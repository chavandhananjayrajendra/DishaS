package com.example.dishas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;

import android.widget.TextView;

import com.example.dishas.databinding.ActivityDetailedBinding;

public class DetailedActivity extends AppCompatActivity {
    ActivityDetailedBinding binding;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        binding = ActivityDetailedBinding.inflate(getLayoutInflater());
        textView = findViewById(R.id.textViewLink);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        Intent intent  = this.getIntent();
        if(intent!= null){
            String name = intent.getStringExtra("name");
            int category = intent.getIntExtra("category",R.string.financecategory);
            int eligibility = intent.getIntExtra("eligibility",R.string.financeeligibility);
            int desc = intent.getIntExtra("objective",R.string.financeDesc);
            int benefits = intent.getIntExtra("benefits",R.string.financebenefits);
            int apply = intent.getIntExtra("apply",R.string.financeapply);
            int documents = intent.getIntExtra("documents",R.string.financedocuments);
            int link = intent.getIntExtra("link",R.string.financewithlink);
            int image = intent.getIntExtra("image",R.drawable.finance);


       binding.detailName.setText(name);
       binding.detailCategory.setText(category);
       binding.detailEligibility.setText(eligibility);
       binding.detailObjective.setText(desc);
       binding.detailBenefits.setText(benefits);
       binding.detailApply.setText(apply);
       binding.detailDocuments.setText(documents);
       binding.textViewLink.setText(link);
       binding.detailImage.setImageResource(image);

        }

    }
}