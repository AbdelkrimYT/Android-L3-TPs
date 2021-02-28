package com.example.tp6exo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowContacts extends AppCompatActivity {

    private ListView list_view;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_contacts);
        list_view = (ListView) findViewById(R.id.list_view);
        db = new DatabaseHelper(this);
        ArrayList<Contact> items = db.getData();
        MyListAdapter adapter = new MyListAdapter(this, R.layout.activity_list_view, items);
        list_view.setAdapter(adapter);
    }
}
