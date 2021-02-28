package com.example.tp5exo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXSTRA_USERNAME = "EXSTRA_USERNAME";

    private EditText username;
    private EditText password;
    private Button login;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);
        db.insert("abdelkarim", "123456789");
        db.insert("user", "123456789");

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
    }

    public void login(View view) {
        if (db.isChecked(username.getText().toString(), password.getText().toString())) {
            String ex_username = username.getText().toString();
            Intent intent = new Intent(this, DashboardActivity.class);
            intent.putExtra("EXSTRA_USERNAME", ex_username);
            startActivity(intent);
        }
        else
            Toast.makeText(this,"username or password uncorrect.", Toast.LENGTH_SHORT).show();
    }

}
