package com.example.majorproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Parks extends Fragment {
    String tnames[];
    String tadd[];
    int tim[];
    RecyclerView recyclerView;
    TemplesAdapter tadapter;
    public Parks() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.listlocations,container,false);
        recyclerView=view.findViewById(R.id.recyclerview);
        tim=new int[]{R.drawable.kanuru,
                R.drawable.raghavaiah,
                R.drawable.klpark,
                R.drawable.vmcpark,
                R.drawable.klpark,
                R.drawable.vmcpark,
                R.drawable.scrap,
                R.drawable.vmcpark

        };

        tnames=getResources().getStringArray(R.array.park);
        tadd=getResources().getStringArray(R.array.parkaddrsess);
        tadapter=new TemplesAdapter(getContext(),tim,tnames,tadd);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),1));
        recyclerView.setAdapter(tadapter);
        return view;
    }
}