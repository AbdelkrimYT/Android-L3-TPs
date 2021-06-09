package com.example.tdexo5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT_FNAME = "com.example.tdexo5.EXTRA_TEXT_FNAME";
    public static final String EXTRA_TEXT_LNAME = "com.example.tdexo5.EXTRA_TEXT_LNAME";

    private Button save, cancel;
    private EditText f_name, l_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        f_name = (EditText) findViewById(R.id.act1_ed_first_name);
        l_name = (EditText) findViewById(R.id.act1_ed_last_name);
        f_name.setText(intent.getStringExtra(SecondActivity.EXTRA_EMPTY_TEXT));
        l_name.setText(intent.getStringExtra(SecondActivity.EXTRA_EMPTY_TEXT));
        save = (Button) findViewById(R.id.act1_btn_save);
        cancel = (Button) findViewById(R.id.act1_btn_cancel);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f_name.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "First name field should not be empty.", Toast.LENGTH_LONG).show();
                } else if (l_name.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Last name field should not be empty.", Toast.LENGTH_LONG).show();
                } else {
                    startActivity(new Intent(getApplicationContext(), SecondActivity.class)
                            .putExtra(EXTRA_TEXT_FNAME, MainActivity.this.f_name.getText().toString())
                            .putExtra(EXTRA_TEXT_LNAME, MainActivity.this.l_name.getText().toString())
                    );
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setMessage("Do you want to exit the application?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Exit...", Toast.LENGTH_LONG).show();
                                MainActivity.super.onBackPressed();
                                //finish();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        });
    }
}