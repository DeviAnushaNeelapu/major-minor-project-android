package com.example.majorproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TemplesAdapter extends RecyclerView.Adapter<TemplesAdapter.ViewHolder>  {
    Context context;
    int imgas[];
    String namess[];
    String addres[];

    public TemplesAdapter(Context context, int[] tim, String[] tnames, String[] tadd) {
        this.context=context;
        this.imgas=tim;
        this.namess=tnames;
        this.addres=tadd;
    }

    /*public TemplesAdapter(Context context, int[] imgas, String[] namess, String[] addres) {
        this.context = context;
        this.imgas = imgas;
        this.namess = namess;
        this.addres = addres;
    }*/

    @NonNull
    @Override
    public TemplesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TemplesAdapter.ViewHolder(LayoutInflater.from(context).inflate(R.layout.eventplaces,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TemplesAdapter.ViewHolder holder, int position) {
      holder.imageView_temple.setImageResource(imgas[position]);
      holder.temple_name.setText(namess[position]);
    }

    @Override
    public int getItemCount() {
        return namess.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView_temple;
        TextView temple_address,temple_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_temple=itemView.findViewById(R.id.image_result);
            temple_address=itemView.findViewById(R.id.address_item);
            temple_name=itemView.findViewById(R.id.name);
            imageView_temple.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos=getLayoutPosition();
                    imageView_temple.buildDrawingCache();
                    String a=addres[pos];
                    String n=temple_name.getText().toString();
                    Intent i = new Intent(context,DetailsForRestActivity.class);
                    i.putExtra("name_temp",n);
                    i.putExtra("add_temp",a);
                    i.putExtra("img_temp",imgas[pos]);
                    context.startActivity(i);
                }
            });
        }
    }
}
