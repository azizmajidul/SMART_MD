package com.stmikbanisaleh.smart_md.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.stmikbanisaleh.smart_md.R;

public class Report extends AppCompatActivity {

    String productName;
    TextView product_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
//        set intent product name to report activity
//        productName = getIntent().getStringExtra(productName);
//        product_name = findViewById(R.id.product_name);
//        product_name.setText(productName);
    }
}