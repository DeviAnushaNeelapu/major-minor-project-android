package com.example.majorproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Temples extends Fragment {
    String tnames[];
    String tadd[];
    int tim[];
    RecyclerView recyclerView;
    TemplesAdapter tadapter;
    public Temples() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.listlocations,container,false);
        recyclerView=view.findViewById(R.id.recyclerview);
        tim=new int[]{R.drawable.kanaka,
                R.drawable.saibaba,
                R.drawable.subhrahmanyeswara,
                R.drawable.ramalingeswra,
                R.drawable.ammavari,
                R.drawable.kanaka,
                R.drawable.ramalingeswra,
                R.drawable.saibaba

        };

        tnames=getResources().getStringArray(R.array.temple);
        tadd=getResources().getStringArray(R.array.templeaddress);
        tadapter=new TemplesAdapter(getContext(),tim,tnames,tadd);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),1));
        recyclerView.setAdapter(tadapter);
        return view;
    }
}