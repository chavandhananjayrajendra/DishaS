package com.example.dishas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import android.animation.LayoutTransition;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;


public class aboutus extends AppCompatActivity {
    TextView detailsText,detailslink;
    LinearLayout layout,layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        detailsText=findViewById(R.id.details);
        layout = findViewById(R.id.layout);
        layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        detailslink=findViewById(R.id.detailslink);
        layout1 = findViewById(R.id.layout1);
      layout1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);


    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void expand(View view) {
        int v= (detailsText.getVisibility()==View.GONE)? View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(layout,new AutoTransition());
        detailsText.setVisibility(v);



    }
    public void expand1(View view){
        int v1= (detailslink.getVisibility()==View.GONE)? View.VISIBLE:View.GONE;
        TransitionManager.beginDelayedTransition(layout1,new AutoTransition());
        detailslink.setVisibility(v1);
    }
}