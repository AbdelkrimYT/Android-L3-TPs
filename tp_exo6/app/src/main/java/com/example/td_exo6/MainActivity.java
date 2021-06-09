package com.example.td_exo6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView listView;
    private ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);
        items = new ArrayList<>();
        items.add(new Item("Google", R.drawable.ic_chrome));
        items.add(new Item("Brave", R.drawable.ic_brave));
        items.add(new Item("Edge", R.drawable.ic_edge));
        items.add(new Item("Mozilla", R.drawable.ic_mozilla));
        items.add(new Item("Opera", R.drawable.ic_opera));
        items.add(new Item("Safari", R.drawable.ic_safari));
        items.add(new Item("Android", R.drawable.ic_android));
        items.add(new Item("Windows 10", R.drawable.ic_windows10));
        items.add(new Item("Windows 7", R.drawable.ic_windows7));
        items.add(new Item("Ubuntu", R.drawable.ic_ubuntu));
        items.add(new Item("Debian", R.drawable.ic_debian));
        items.add(new Item("Kali linux", R.drawable.ic_kali_linux));
        items.add(new Item("Fedora", R.drawable.ic_fedora));
        items.add(new Item("Archlinux", R.drawable.ic_archlinux));
        items.add(new Item("Python", R.drawable.ic_python));
        items.add(new Item("Embarcadero", R.drawable.ic_emp));
        items.add(new Item("RAD Studio", R.drawable.ic_rad));
        items.add(new Item("Delphi", R.drawable.ic_dx));
        items.add(new Item("C++ builder", R.drawable.ic_cx));
        items.add(new Item("InterBase", R.drawable.ic_interbase));
        items.add(new Item("Java", R.drawable.ic_java));
        items.add(new Item("C++", R.drawable.ic_cpp));
        items.add(new Item("Mysql", R.drawable.ic_mysql));
        items.add(new Item("PHP", R.drawable.ic_php));
        items.add(new Item("Laravel", R.drawable.ic_laravel));
        ItemViewAdapter adapter = new ItemViewAdapter(this, R.layout.item_view, items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = items.get(position).getText();
                Toast.makeText(getApplicationContext(), "You select " + text + " Position: " + position, Toast.LENGTH_LONG).show();
            }
        });
    }
}