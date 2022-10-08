package com.example.prempatel_project;

import static android.widget.LinearLayout.HORIZONTAL;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity{

    //list to store all the products
    List<Products> productsList;

    //recyclerview
    RecyclerView recyclerView;

    private ProductAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.product_recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);

        //initializing the productlist
        productsList = new ArrayList<>();


        //adding some items to our list
        productsList.add(
                new Products(
                        1,
                        "Blazer",
                        "Black with shades",
                        "220$",
                        R.mipmap.man_1,
                        "Running Shoes",
                        "sizes - 8,9,10,11",
                        "It's made with the same cushioned comfort you love, plus tough traction and improved midfoot construction for secure, neutral support.The waterproof upper helps keep you moving on rocky trails"));

        productsList.add(
                new Products(
                        2,
                        "Pegasus",
                        "Gray",
                        "240$",
                        R.mipmap.man_2,
                        "Running Shoes",
                        "sizes - 8,9,10,11",
                        "It's made with the same cushioned comfort you love, plus tough traction and improved midfoot construction for secure, neutral support.The waterproof upper helps keep you moving on rocky trails"));

        productsList.add(
                new Products(
                        3,
                        "Super Rap",
                        "Pink",
                        "180$",
                        R.mipmap.woman_1,
                        "Running Shoes",
                        "sizes - 8,9,10,11",
                        "It's made with the same cushioned comfort you love, plus tough traction and improved midfoot construction for secure, neutral support.The waterproof upper helps keep you moving on rocky trails"));

        productsList.add(
                new Products(
                        4,
                        "Alpha Fly",
                        "White",
                        "175$",
                        R.mipmap.woman_2,
                        "Running Shoes",
                        "sizes - 8,9,10,11",
                        "It's made with the same cushioned comfort you love, plus tough traction and improved midfoot construction for secure, neutral support.The waterproof upper helps keep you moving on rocky trails"));

        productsList.add(
                new Products(
                        5,
                        "Star Runner",
                        "Blue",
                        "150$",
                        R.mipmap.kids_1,
                        "Running Shoes",
                        "sizes - 8,9,10,11",
                        "It's made with the same cushioned comfort you love, plus tough traction and improved midfoot construction for secure, neutral support.The waterproof upper helps keep you moving on rocky trails"));

        productsList.add(
                new Products(
                        6,
                        "Flex",
                        "Yellow",
                        "140$",
                        R.mipmap.kids_2,
                        "Running Shoes",
                        "sizes - 8,9,10,11",
                        "It's made with the same cushioned comfort you love, plus tough traction and improved midfoot construction for secure, neutral support.The waterproof upper helps keep you moving on rocky trails"));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productsList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }

}