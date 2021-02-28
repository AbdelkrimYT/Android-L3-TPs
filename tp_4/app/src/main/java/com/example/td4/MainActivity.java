package com.example.td4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton iBtnBlue;
    private ImageButton iBtnRed;
    private TextView text;
    private RadioButton rbBlue, rbJaune, rbRouge;
    private ToggleButton togBlue, togJaune, togRouge;
    private RadioGroup rg;
    private Button changeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iBtnBlue = (ImageButton) findViewById(R.id.imageButtonBlue);
        iBtnRed = (ImageButton) findViewById(R.id.imageButtonRed);
        text = (TextView) findViewById(R.id.textView);

        rbBlue = (RadioButton) findViewById(R.id.radioButtonBlue);
        rbJaune = (RadioButton) findViewById(R.id.radioButtonJaune);
        rbRouge = (RadioButton) findViewById(R.id.radioButtonRouge);


        togBlue = (ToggleButton) findViewById(R.id.togBtnBlue);
        togJaune = (ToggleButton) findViewById(R.id.togBtnJaune);
        togRouge = (ToggleButton) findViewById(R.id.togBtnRed);

        rg = (RadioGroup) findViewById(R.id.rg);
        changeColor = (Button) findViewById(R.id.changeColor);

        iBtnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextColor(Color.BLUE);
            }
        });

        iBtnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextColor(Color.RED);
            }
        });

        rbBlue.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    text.setTextColor(Color.BLUE);
            }
        });

        rbJaune.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    text.setTextColor(Color.YELLOW);
            }
        });

        rbRouge.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    text.setTextColor(Color.RED);
            }
        });

        togBlue.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    text.setTextColor(Color.BLUE);
                else
                    text.setTextColor(Color.BLACK);
            }
        });

        togJaune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (togJaune.isChecked())
                    text.setTextColor(Color.YELLOW);
                else
                    text.setTextColor(Color.BLACK);
            }
        });

        togRouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (togRouge.isChecked())
                    text.setTextColor(Color.RED);
                else
                    text.setTextColor(Color.BLACK);
            }
        });

        changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rg.getCheckedRadioButtonId() == R.id.rbb)
                    text.setTextColor(Color.BLUE);
                else if (rg.getCheckedRadioButtonId() == R.id.rbj)
                    text.setTextColor(Color.YELLOW);
                else if (rg.getCheckedRadioButtonId() == R.id.rbr)
                    text.setTextColor(Color.RED);
            }
        });

    }
}
