package com.example.tp5exo1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.DialogCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXSTRA_NAME = "EXSTRA_NAME";
    public static final String EXSTRA_LAST_NAME = "EXSTRA_LAST_NAME";

    private Button save;
    private Button cancel;
    private EditText name;
    private EditText last_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = (Button) findViewById(R.id.save);
        cancel = (Button) findViewById(R.id.cancel);
        name = (EditText) findViewById(R.id.nom);
        last_name = (EditText) findViewById(R.id.prenom);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDisplayActivity();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);
                alertBuilder.setMessage("Do you want quit this app ?").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = alertBuilder.create();
                alert.setTitle("Warning!");
                alert.show();
            }
        });
    }

    private void startDisplayActivity() {
        boolean ne;
        if ((ne=name.getText().toString().isEmpty()) || last_name.getText().toString().isEmpty())
            Toast.makeText(MainActivity.this, ne ? "Le nome est vide." : "Le prenom est vide.", Toast.LENGTH_SHORT).show();
        else {
            String ex_name = name.getText().toString();
            String ex_last_name = last_name.getText().toString();
            Intent intent = new Intent(this, DisplayActivity.class);
            intent.putExtra("EXSTRA_NAME", ex_name);
            intent.putExtra("EXSTRA_LAST_NAME", ex_last_name);
            startActivity(intent);
        }
    }

}
