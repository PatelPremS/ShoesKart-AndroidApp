package com.example.prempatel_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    private Button btnExplore;
    private Button btnmen;
    private Button btnwomen;
    private Button btnkids;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExplore = findViewById(R.id.btn_explore);
        btnmen = findViewById(R.id.men_btn);
        btnwomen = findViewById(R.id.women_btn);
        btnkids = findViewById(R.id.kids_btn);

        btnExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(ip);

            }
        });

        btnmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(ip);

            }
        });

        btnwomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(ip);

            }
        });

        btnkids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(ip);

            }
        });

            viewPager = findViewById(R.id.slider_view);

            sliderView sliderView = new sliderView(this);

            viewPager.setAdapter(sliderView);

            viewPager.setCurrentItem(0);
            sliderView.setTimer(viewPager,3);
            setSupportActionBar(toolbar);


            };

        }
