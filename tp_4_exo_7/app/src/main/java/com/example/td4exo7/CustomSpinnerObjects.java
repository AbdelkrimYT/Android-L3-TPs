package com.example.td4exo7;

import android.graphics.Color;

import androidx.annotation.NonNull;

public class CustomSpinnerObjects {
    private String itemName;
    private int backgound;
    private int text;

    public CustomSpinnerObjects(String itemName, int backgound, int text) {
        this.itemName = itemName;
        this.backgound = backgound;
        this.text = text;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getBackgound() {
        return backgound;
    }

    public void setBackgound(int backgound) {
        this.backgound = backgound;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    @NonNull
    @Override
    public String toString() {
        return itemName;
    }
}
