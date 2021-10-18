package com.stmikbanisaleh.smart_md.Model_Ok.Store;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductList_m {

    @SerializedName("product_id")
    @Expose
    private String product_id;

    @SerializedName("product_name")
    @Expose
    private String product_name;

    @SerializedName("category_name")
    @Expose
    private String category_name;

    public ProductList_m() {
    }

    public ProductList_m(String product_id, String product_name, String category_name) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.category_name = category_name;
    }


    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}



