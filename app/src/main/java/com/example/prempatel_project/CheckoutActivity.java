package com.example.prempatel_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CheckoutActivity extends AppCompatActivity {

    private Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        btn_submit = findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(CheckoutActivity.this);
                alertbuilder.setMessage("Your details are saved successfully. Press ok to complete your payment");
                alertbuilder.setTitle("Procces to pay?");
                alertbuilder.setCancelable(false);
                alertbuilder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                });

                alertbuilder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(CheckoutActivity.this, "Your order is successfully placed", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(CheckoutActivity.this , MainActivity.class);
                        startActivity(intent);
                    }
                });

                AlertDialog alert = alertbuilder.create();
                alert.show();
            }
        });
    }
}