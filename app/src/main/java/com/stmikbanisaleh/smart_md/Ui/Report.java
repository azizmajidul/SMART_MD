package com.stmikbanisaleh.smart_md.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.stmikbanisaleh.smart_md.R;

public class Report extends AppCompatActivity {

    String productName;
    String store_id, store_name;
    TextView product_name;
    TextView textStore_id, textStore_Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
//        set intent product name to report activity
        productName = getIntent().getStringExtra("product_name");
        product_name = findViewById(R.id.product_name);
        product_name.setText(productName);

//        store_id = getIntent().getStringExtra("store_id");
//        store_name = getIntent().getStringExtra("store_name");
//        textStore_id = findViewById(R.id.textStore_id);
//        textStore_Name = findViewById(R.id.textStore_Name);
//
//
//        textStore_id.setText(store_id);
//        textStore_Name.setText(store_name);



    }
}