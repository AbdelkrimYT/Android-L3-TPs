package com.example.tp6exo2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button save;
    private EditText nom, prenom, mobile, email;
    private DatabaseHelper db;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.m_id) {
            Intent intent = new Intent(this, ShowContacts.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = (Button) findViewById(R.id.save_button);
        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        mobile = (EditText) findViewById(R.id.mobile);
        email = (EditText) findViewById(R.id.email);
        db = new DatabaseHelper(this);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nom.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(), "Nome est vide", Toast.LENGTH_SHORT).show();
                else if (prenom.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(), "Prénom est vide", Toast.LENGTH_SHORT).show();
                else if (mobile.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(), "mobile est vide", Toast.LENGTH_SHORT).show();
                else if (email.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(), "email est vide", Toast.LENGTH_SHORT).show();
                else {
                    Contact contact = new Contact(
                            nom.getText().toString(),
                            prenom.getText().toString(),
                            mobile.getText().toString(),
                            email.getText().toString()
                    );
                    db.insert(contact);
                }
            }
        });
    }
}
