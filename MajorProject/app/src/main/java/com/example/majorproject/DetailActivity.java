package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
 ImageView imageView;
 TextView textView1,textView2;
 String address[];
 String names[];
 int Images[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        imageView=findViewById(R.id.imagedetails);
        textView1=findViewById(R.id.text_details_one);
        textView2=findViewById(R.id.text_details_two);
        names=getResources().getStringArray(R.array.tourism);
        address=getResources().getStringArray(R.array.tourismaddress);
        Intent i=getIntent();
        int in=i.getIntExtra("iii",0);
        String ai=i.getStringExtra("nnn");
        String an=i.getStringExtra("aaa");
        textView1.setText(ai);
        textView2.setText(an);
        imageView.setImageResource(in);
    }
}