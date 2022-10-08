package com.example.prempatel_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetailActivity extends AppCompatActivity {

    String name;
    String color;
    String price;
    int image;
    String type;
    String size;
    String detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        TextView viewName = findViewById(R.id.textViewName_detail);
        TextView viewprice = findViewById(R.id.textViewPrice_detail);
        TextView viewColor = findViewById(R.id.textViewColor_detail);
        TextView viewType = findViewById(R.id.textViewType_detail);
        TextView viewSize = findViewById(R.id.textViewSize_detail);
        ImageView viewimage = findViewById(R.id.viewimg_detail);
        TextView viewDetail = findViewById(R.id.textViewDetail_detail);

        Intent intent = getIntent();
        if(intent != null) {
            name = intent.getStringExtra("name");
            price = intent.getStringExtra("price");
            color = intent.getStringExtra("color");
            type = intent.getStringExtra("type");
            size = intent.getStringExtra("size");
            image = intent.getIntExtra("image" , 0);
            detail = intent.getStringExtra("detail");

            viewName.setText(name);
            viewprice.setText(String.valueOf(price));
            viewColor.setText(color);
            viewType.setText(type);
            viewSize.setText(size);
            viewimage.setImageDrawable(getDrawable(image));
            viewDetail.setText(detail);

        }

        Button btn = (Button) findViewById(R.id.btn_buynow_my_detail);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V){
                Intent intent = new Intent(ProductDetailActivity.this , CheckoutActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("price", price);
                intent.putExtra("color", color);
                intent.putExtra("type", type);
                intent.putExtra("size", size);
                intent.putExtra("image", image);
                intent.putExtra("detail",detail);
                startActivity(intent);
            }
        });

    }
}