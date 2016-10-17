package com.example.junior.happydinner.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.junior.happydinner.R;
import com.example.junior.happydinner.holder.EstablishmentViewHolder;
import com.example.junior.happydinner.models.Establishment;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by junior on 27/07/16.
 */
public class EstablishmentAdapter extends RecyclerView.Adapter<EstablishmentViewHolder> {
    List<Establishment> list;
    Context context;
    LayoutInflater inflater;
    public EstablishmentAdapter(List<Establishment> l,Context c){
        list=l;
        context=c;
        inflater=LayoutInflater.from(c);

    }

    @Override
    public EstablishmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_list_establishment,parent,false);
        EstablishmentViewHolder evh=new EstablishmentViewHolder(v,context);

        return evh;
    }

    @Override
    public void onBindViewHolder(EstablishmentViewHolder holder, int position) {
        holder.name.setText(list.get(position).getName());
        holder.category.setText(list.get(position).getCategory());
        holder.location.setText(list.get(position).getLocation());
        if (list.get(position).isDelivery()){
            holder.delivery.setImageDrawable(context.getResources().getDrawable(R.drawable.bikewhite));
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
