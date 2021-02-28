package com.example.tp5exo2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    private TextView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        user = (TextView) findViewById(R.id.username);
        Intent intent = getIntent();
        user.setText("Username: " + intent.getStringExtra(MainActivity.EXSTRA_USERNAME));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.tp_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.taill_10:
                user.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10f);
                return true;
            case R.id.taill_12:
                user.setTextSize(TypedValue.COMPLEX_UNIT_SP,12f);
                return true;
            case R.id.taill_14:
                user.setTextSize(TypedValue.COMPLEX_UNIT_SP,14f);
                return true;
            case R.id.taill_16:
                user.setTextSize(TypedValue.COMPLEX_UNIT_SP,16f);
                return true;
            case R.id.taill_18:
                user.setTextSize(TypedValue.COMPLEX_UNIT_SP,18f);
                return true;
            case R.id.taill_20:
                user.setTextSize(TypedValue.COMPLEX_UNIT_SP,20f);
                return true;

            case R.id.couleu_blue:
                user.setTextColor(Color.BLUE);
                return true;
            case R.id.couleu_joune:
                user.setTextColor(Color.YELLOW);
                return true;
            case R.id.couleu_rouge:
                user.setTextColor(Color.RED);
                return true;
            case R.id.couleu_vert:
                user.setTextColor(Color.GREEN);
                return true;

            case R.id.family_roboto_thin:
                user.setTypeface(Typeface.create("roboto-thin", Typeface.NORMAL));
                return true;
            case R.id.family_sans_serif_light:
                user.setTypeface(Typeface.create("sans-serif-light", Typeface.NORMAL));
                return true;
            case R.id.family_roboto_regular:
                user.setTypeface(Typeface.create("roboto-regular", Typeface.NORMAL));
                return true;
            case R.id.family_sans_cutive_mono:
                user.setTypeface(Typeface.create("sans-cutive-monon", Typeface.NORMAL));
                return true;

            case R.id.style_normal:
                user.setTypeface(null, Typeface.NORMAL);
                return true;
            case R.id.style_bold:
                user.setTypeface(null, Typeface.BOLD);
                return true;
            case R.id._style_italic:
                user.setTypeface(null, Typeface.ITALIC);
                return true;

            default:
                return true;
        }
    }
}
