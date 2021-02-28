package com.example.tp6exo1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<Module> {

    private Context context;
    private int resource;

    public MyListAdapter(Context context, int resource, ArrayList<Module> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource, parent, false);

        TextView col_1 = (TextView) convertView.findViewById(R.id.view_nom_du_module);
        TextView col_2 = (TextView) convertView.findViewById(R.id.view_charge_horaire);
        TextView col_3 = (TextView) convertView.findViewById(R.id.view_coefficient);

        col_1.setText(getItem(position).getModule().toString());
        col_2.setText(getItem(position).getHoraire().toString());
        col_3.setText(getItem(position).getCoefficient().toString());
        return convertView;
    }
}
