package com.example.tdexo5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_EMPTY_TEXT = "com.example.tdexo5.EXTRA_TEXT_EMPTY_FNAME";

    private EditText f_name, l_name;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        f_name = (EditText) findViewById(R.id.act2_ed_first_name);
        l_name = (EditText) findViewById(R.id.act2_ed_last_name);
        cancel = (Button) findViewById(R.id.act2_btn_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class)
                        .putExtra(EXTRA_EMPTY_TEXT, "")
                );
            }
        });
        f_name.setText(intent.getStringExtra(MainActivity.EXTRA_TEXT_FNAME));
        l_name.setText(intent.getStringExtra(MainActivity.EXTRA_TEXT_LNAME));
    }
}