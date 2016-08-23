package com.example.yogeshpatil.stackviewdemo;

import android.graphics.drawable.Drawable;

public class StackItem {

    public String text;
    public Drawable img;

    public StackItem(String text,Drawable photo)
    {
        this.img = photo;
        this.text = text;
    }
}