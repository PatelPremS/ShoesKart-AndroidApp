package com.example.prempatel_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Products extends AppCompatActivity {
    private int id;
    private String name;
    private String color;
    private String price;
    private int image;
    private String type;
    private String size;
    private String detail;


    private Button buynow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products);

    }

    public Products(int id, String name, String color, String price, int image, String type,String size,String detail) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.image = image;
        this.type = type;
        this.size = size;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public String getType() { return type;}

    public String getSize() { return size;}

    public String getDetail() { return detail;}
}
