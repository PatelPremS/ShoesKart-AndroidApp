package com.example.prempatel_project;


import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Products> productsList;

    private itemClickListener clickListener;

    //getting the context and product list with constructor
    public ProductAdapter(Context mCtx, List<Products> productsList) {
        this.mCtx = mCtx;
        this.productsList = productsList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.products, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position

        Products products = productsList.get(position);

        holder.textViewTitle.setText(products.getName());
        holder.textViewColor.setText(String.valueOf(products.getColor()));
        holder.textViewPrice.setText(String.valueOf(products.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(products.getImage()));

        holder.buyNoRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCtx, CheckoutActivity.class);
                mCtx.startActivity(intent);
            }
        });

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(mCtx, ProductDetailActivity.class);
                intent.putExtra("name", products.getName());
                intent.putExtra("color", products.getColor());
                intent.putExtra("price", products.getPrice());
                intent.putExtra("image", products.getImage());
                intent.putExtra("type", products.getType());
                intent.putExtra("size", products.getSize());
                intent.putExtra("detail", products.getDetail());
                mCtx.startActivity(intent);

            }
        });
    }


    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public void setClickListener(itemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textViewTitle, textViewPrice, textViewColor;
        ImageView imageView;
        Button buyNoRecycler;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            textViewColor = itemView.findViewById(R.id.textViewColor);
            buyNoRecycler = itemView.findViewById(R.id.btn_buynow_my);
            imageView = itemView.findViewById(R.id.imageTitle);



            //itemView.setTag(itemView);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            if (clickListener != null) clickListener.onClick(view, getAdapterPosition());
        }
    }
}