package com.example.junior.happydinner.holder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.junior.happydinner.R;
import com.example.junior.happydinner.activitys.DetailEstablishmentActivity;

import org.w3c.dom.Text;

/**
 * Created by junior on 27/07/16.
 */
public class EstablishmentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView name,category,location,distance;
    public ImageView delivery;
    private Context context;
    public EstablishmentViewHolder(View itemView,Context c) {
        super(itemView);
        context=c;

        name=(TextView) itemView.findViewById(R.id.name);
        category=(TextView) itemView.findViewById(R.id.category);
        location=(TextView) itemView.findViewById(R.id.location);
        distance=(TextView) itemView.findViewById(R.id.distance);
        delivery=(ImageView) itemView.findViewById(R.id.delivery);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        context.startActivity(new Intent(context, DetailEstablishmentActivity.class));
    }
}
