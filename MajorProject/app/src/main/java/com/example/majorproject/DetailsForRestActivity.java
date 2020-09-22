package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsForRestActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView1,textView2;
    String address[];
    String names[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_for_rest);
        imageView=findViewById(R.id.imageViews);
        textView1=findViewById(R.id.textview1s);
        textView2=findViewById(R.id.textview2s);
        names=getResources().getStringArray(R.array.tourism);
        address=getResources().getStringArray(R.array.tourismaddress);
        Intent i=getIntent();
        int in=i.getIntExtra("img_temp",0);
        String ai=i.getStringExtra("name_temp");
        String an=i.getStringExtra("add_temp");
        textView1.setText(ai);
        textView2.setText(an);
        imageView.setImageResource(in);
    }
}