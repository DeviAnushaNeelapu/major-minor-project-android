package com.example.majorproject;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class TabLayoutdesign extends AppCompatActivity {
    String[] array={"Restaurants","Temples","Parks","Tourisms"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayoutdesign);
        ViewPager viewPager=(ViewPager)findViewById(R.id.pager);
        TabLayout tabLayout=(TabLayout)findViewById(R.id.tab);
        //ItemAdapter adapter=new ItemAdapter(this,getSupportFragmentManager());

        ItemAdapter adapter=new ItemAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setupWithViewPager(viewPager);

    }
/*ou*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menus,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

      switch(item.getItemId()){
          case R.id.address_item:
              Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
               break;
          case R.id.about:
              showAlert();
              break;

      }
        return super.onOptionsItemSelected(item);
    }
    public void showAlert(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(R.string.abt_msg);
        builder.setMessage(R.string.alert_msg);
        builder.setIcon(R.drawable.vijayawada);
        builder.setPositiveButton("okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.show();

    }
}
