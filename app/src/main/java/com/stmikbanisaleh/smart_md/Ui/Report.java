package com.stmikbanisaleh.smart_md.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.stmikbanisaleh.smart_md.R;

public class Report extends AppCompatActivity {

    String productId, productName, category_id;
    String store_id, store_name, id_toko;
    TextView product_name;
    EditText product_id,txttoko_id,  id_category;
    TextView textStore_id, textStore_Name ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
//        set intent product name to report activity

//        id toko
        id_toko = getIntent().getStringExtra("id_toko");
        txttoko_id = findViewById(R.id.txttoko_id);
        txttoko_id.setText(id_toko);


        //      store id
        store_id = getIntent().getStringExtra("store_id");
        store_name = getIntent().getStringExtra("store_name");
        textStore_id = findViewById(R.id.textStore_id);
        textStore_Name = findViewById(R.id.textStore_Name);
//
//store Name
        textStore_id.setText(store_id);
        textStore_Name.setText(store_name);



//        product name
        productName = getIntent().getStringExtra("product_name");
        product_name = findViewById(R.id.product_name);
        product_name.setText(productName);

//        product id
        productId = getIntent().getStringExtra("product_id");
        product_id = findViewById(R.id.id_product);
        product_id.setText(productId);


//category id

        category_id = getIntent().getStringExtra("category_id");
        id_category = findViewById(R.id.id_category);
        id_category.setText(category_id);





    }
}