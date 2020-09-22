package com.example.majorproject;

import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Tourism extends Fragment {
    String names[];
    String add[];
    String rat[];
    int im[];
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    public Tourism() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.listlocations,container,false);
        recyclerView=view.findViewById(R.id.recyclerview);
        im=new int[]{R.drawable.akkanna,
                R.drawable.vmcpark,
                R.drawable.akkanna,
                R.drawable.klpark,
                R.drawable.akkanna,

        };
        rat=new String[]{"4.2","4.5","4.3","5.0",
                "4.8"};
        names=getResources().getStringArray(R.array.tourism);
        add=getResources().getStringArray(R.array.tourismaddress);
        adapter=new RecyclerAdapter(getContext(),rat,im,names,add);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),1));
        recyclerView.setAdapter(adapter);
        return view;
    }
}