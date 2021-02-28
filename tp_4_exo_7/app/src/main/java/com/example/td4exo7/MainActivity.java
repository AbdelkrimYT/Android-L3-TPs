package com.example.td4exo7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView text;
    private Spinner custom_spinner;
    private ConstraintLayout activity_control;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_control = (ConstraintLayout) findViewById(R.id.activity_control);
        spinner = (Spinner) findViewById(R.id.spinner);
        custom_spinner = (Spinner) findViewById(R.id.custom_spinner);
        text = (TextView) findViewById(R.id.text);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equals("Rouge"))
                    text.setTextColor(Color.RED);
                if (parent.getItemAtPosition(position).toString().equals("Jaune"))
                    text.setTextColor(Color.YELLOW);
                if (parent.getItemAtPosition(position).toString().equals("Vert"))
                    text.setTextColor(Color.GREEN);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                text.setTextColor(Color.BLACK);
            }
        });

        List<CustomSpinnerObjects> items= new ArrayList<>();
        items.add(new CustomSpinnerObjects("Defult", Color.WHITE, Color.BLACK));
        items.add(new CustomSpinnerObjects("Style 1", Color.GREEN, Color.WHITE));
        items.add(new CustomSpinnerObjects("Style 2", Color.GRAY, Color.LTGRAY));

        ArrayAdapter<CustomSpinnerObjects> adapter = new ArrayAdapter<CustomSpinnerObjects>(this, R.layout.support_simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        custom_spinner.setAdapter(adapter);
        custom_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CustomSpinnerObjects color = (CustomSpinnerObjects) parent.getItemAtPosition(position);
                activity_control.setBackgroundColor(color.getBackgound());
                text.setTextColor(color.getText());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO
            }
        });
    }
}
