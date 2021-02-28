package com.example.tp5exo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView name, last_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        name = (TextView) findViewById(R.id.name);
        last_name = (TextView) findViewById(R.id.last_name);

        Intent intent = getIntent();
        name.setText("Name: " + intent.getStringExtra(MainActivity.EXSTRA_NAME));
        last_name.setText("Last Name: " + intent.getStringExtra(MainActivity.EXSTRA_LAST_NAME));
    }
}
