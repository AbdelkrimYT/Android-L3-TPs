package com.example.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivityExercic5 extends AppCompatActivity {

    private Button debut;
    private Button fin;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercic_5);

        this.debut = (Button) findViewById(R.id.debut);
        this.fin = (Button) findViewById(R.id.fin);
        this.text = (TextView) findViewById(R.id.text);

        debut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(R.string.bonjour);
            }
        });

        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(R.string.au_revoir);
            }
        });

    }

}
