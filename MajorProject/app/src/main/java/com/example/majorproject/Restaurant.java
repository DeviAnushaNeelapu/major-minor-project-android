package com.example.majorproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Restaurant extends Fragment {
   String names[];
   String add[];
   String rat[];
   int im[];
   RecyclerView recyclerView;
   RecyclerAdapter adapter;
    public Restaurant() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.listlocations,container,false);
        recyclerView=view.findViewById(R.id.recyclerview);
        im=new int[]{R.drawable.rasoie,
                R.drawable.barbique,
                R.drawable.sarvor,
                R.drawable.sriramayya,
                R.drawable.rasoie,
                R.drawable.sarvor,
                R.drawable.babai,
                R.drawable.temptations
                };
        rat=new String[]{"4.2","4.5","4.3","5.0",
        "4.0","3.4","0.5","4.5"};
        names=getResources().getStringArray(R.array.restuarants);
        add=getResources().getStringArray(R.array.restaurantsaddress);
        adapter=new RecyclerAdapter(getContext(),rat,im,names,add);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),1));
        recyclerView.setAdapter(adapter);
        return view;
    }
}