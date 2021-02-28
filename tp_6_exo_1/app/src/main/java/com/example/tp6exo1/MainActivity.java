package com.example.tp6exo1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list_view;
    private MyListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_view = (ListView) findViewById(R.id.list_view);

        ArrayList<Module> items = new ArrayList<Module>();
        items.add(new Module("Module 1", "30", "4", "Desc 1"));
        items.add(new Module("Module 2", "25", "2", "Desc 2"));
        items.add(new Module("Module 3", "12", "3", "Desc 3"));
        items.add(new Module("Module 4", "24", "1", "Desc 4"));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.custom_list_view, items);
        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showMessage(position);
            }
        });
    }

    private void showMessage(int position) {
        String item = adapter.getItem(position).getDescription();
        Toast.makeText(getApplicationContext(), item, Toast.LENGTH_LONG).show();
    }
}
