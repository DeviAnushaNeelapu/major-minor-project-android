package com.example.majorproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
        Context context;
        String rating[];
        int img[];
        String name[];
        String add[];

    public RecyclerAdapter(Context context, String[] rating, int[] img, String[] name, String[] add) {
        this.context = context;
        this.rating = rating;
        this.img = img;
        this.name = name;
        this.add = add;
    }



    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerview_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
     holder.name.setText(name[position]);
     holder.rating.setText("Rating:"+rating[position]);
     holder.iv.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView name,address,rating;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.image_list);
            name=itemView.findViewById(R.id.name);
            address=itemView.findViewById(R.id.address);
            rating=itemView.findViewById(R.id.rating_bar_list);
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "click", Toast.LENGTH_SHORT).show();
                    int pos=getLayoutPosition();
                    iv.buildDrawingCache();
                    String names=name.getText().toString();
                    String adda=add[pos];
                    String ra=rating.getText().toString();
                    Intent i=new Intent(context,DetailActivity.class);
                    i.putExtra("iii",img[pos]);
                    i.putExtra("nnn",names);
                    i.putExtra("r",ra);
                    i.putExtra("aaa",adda);
                    context.startActivity(i);

                }
            });
        }
    }
}
