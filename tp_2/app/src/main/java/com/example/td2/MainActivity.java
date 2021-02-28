package com.example.td2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button = (Button) findViewById(R.id.button);
        this.text = (TextView) findViewById(R.id.textView);
        this.button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.text.setText(R.string.textChange);
    }

}
