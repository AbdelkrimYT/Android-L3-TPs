package com.example.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private TextView text;
    private Integer count = new Integer(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercic_3_4);
        this.button = (Button) findViewById(R.id.button);
        this.text = (TextView) findViewById(R.id.text);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        button.setTextColor(Color.argb(255, red, green, blue));
        text.setText("Number of clicks: " + (++count).toString());
        text.setTextColor(Color.argb(255, red, green, blue));
    }
}
