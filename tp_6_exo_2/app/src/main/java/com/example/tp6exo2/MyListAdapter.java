package com.example.tp6exo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private int resource;

    public MyListAdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource, parent, false);

        TextView col_1 = (TextView) convertView.findViewById(R.id.lv_nom);
        TextView col_2 = (TextView) convertView.findViewById(R.id.lv_prenom);
        TextView col_3 = (TextView) convertView.findViewById(R.id.lv_mobile);
        TextView col_4 = (TextView) convertView.findViewById(R.id.lv_email);

        col_1.setText(getItem(position).getName().toString());
        col_2.setText(getItem(position).getLast_name().toString());
        col_3.setText(getItem(position).getMobile().toString());
        col_4.setText(getItem(position).getMobile().toString());
        return convertView;
    }
}
