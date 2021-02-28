package com.example.tp6exo2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(@Nullable Context context) {
        super(context, "database.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE \"contacts\" (\"nom\" TEXT,\"prenom\" TEXT, \"mobile\", \"email\", PRIMARY KEY(\"email\"));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }

    public boolean insert(Contact object) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nom", object.getName());
        contentValues.put("prenom", object.getLast_name());
        contentValues.put("mobile", object.getMobile());
        contentValues.put("email", object.getEmail());
        if (db.insert("contacts", null, contentValues) == -1)
            return true;
        return false;
    }

    public ArrayList<Contact> getData() {

        ArrayList<Contact> get_list = new ArrayList<Contact>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from contacts ;", null);

        while(cursor.moveToNext())
            get_list.add(new Contact(
                    cursor.getString(cursor.getColumnIndex("nom")),
                    cursor.getString(cursor.getColumnIndex("prenom")),
                    cursor.getString(cursor.getColumnIndex("mobile")),
                    cursor.getString(cursor.getColumnIndex("email"))
            ));

        return get_list;
    }
}
