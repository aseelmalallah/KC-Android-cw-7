package com.example.cw7;

import android.content.Context;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

public class ItemAdapter extends ArrayAdapter {

    List<Items> ItemsList;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        ItemsList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);

        Items currentItem = ItemsList.get(position);

        TextView DN = view.findViewById(R.id.Name);
        TextView DP = view.findViewById(R.id.Price);
        ImageView DI = view.findViewById(R.id.DImage);



        DN.setText(currentItem.getIteName());
        DP.setText(String.valueOf(currentItem.getItemPrice()));
        DI.setImageResource(currentItem.getItemImage());
           return view;


    }
}
