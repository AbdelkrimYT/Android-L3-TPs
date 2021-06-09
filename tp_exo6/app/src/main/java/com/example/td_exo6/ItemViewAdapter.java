package com.example.td_exo6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemViewAdapter extends ArrayAdapter<Item> {

    private Context context;
    private int resource;

    public ItemViewAdapter(@NonNull Context context, int resource, ArrayList<Item> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource, parent, false);

        TextView text = (TextView) convertView.findViewById(R.id.lv_text);
        CircleImageView image = (CircleImageView) convertView.findViewById(R.id.lv_icon);
        text.setText(getItem(position).getText().toString());
        image.setImageResource(getItem(position).getImage_id());

        return convertView;
    }
}
