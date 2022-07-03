package com.example.musicstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseQuantity(View view) {
        quantity = quantity + 1;
        TextView quantityTextView = findViewById(R.id.realQuantity);
        quantityTextView.setText("" + quantity);
    }

    public void decreaseQuantity(View view) {
        quantity = quantity - 1;
        TextView decreaseTextView = findViewById(R.id.realQuantity);
        decreaseTextView.setText("" + quantity);
    }
}