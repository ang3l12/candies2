package com.example.candies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CandyAdapter extends RecyclerView.Adapter<CandyAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Candy> candies;

    public CandyAdapter(Context context, List<Candy> candies) {
        this.inflater=LayoutInflater.from(context);
        this.candies=candies;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CandyAdapter.ViewHolder holder, int position) {
    Candy candy=candies.get(position);
    holder.candyView.setImageResource(candy.getCandyResourse());
    holder.nameView.setText(candy.getName());
    holder.myscoreView.setText(candy.getMyscore());
    holder.dateView.setText(candy.getDate());
    }



    @Override
    public int getItemCount() { return candies.size();}


    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView candyView;
        final TextView nameView, myscoreView, dateView;

        ViewHolder(View view) {
            super(view);
            candyView = view.findViewById(R.id.candyResourse);
            nameView = view.findViewById(R.id.name);
            myscoreView = view.findViewById(R.id.myscore);
            dateView = view.findViewById(R.id.date);
        }
    }
}
