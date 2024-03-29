package com.example.foodrecipesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LunchAdapter extends RecyclerView.Adapter<LunchAdapter.lunchViewholder> {

    String [] data;

    public LunchAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public lunchViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_raw_lunch,parent,false);
        return new lunchViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull lunchViewholder holder, int position) {

        holder.tv1.setText(data[position]);
        holder.tv2.setText(data[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    static class lunchViewholder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView tv1,tv2;
        public lunchViewholder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageView);
            tv1 = itemView.findViewById(R.id.tvHeader);
            tv2 = itemView.findViewById(R.id.tvDesc);
        }
    }
}
