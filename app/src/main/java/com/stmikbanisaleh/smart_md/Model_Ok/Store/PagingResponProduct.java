package com.stmikbanisaleh.smart_md.Model_Ok.Store;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.stmikbanisaleh.smart_md.Model_Ok.Visit.ListVisit;
import com.stmikbanisaleh.smart_md.Ui.ProductList;

import java.util.List;

public class PagingResponProduct {

    @SerializedName("Data")
    @Expose
    private List<ProductList_m> Data;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private boolean status;

    @SerializedName("totalcount")
    @Expose
    int totalcount;

    public PagingResponProduct() {
    }

    public PagingResponProduct(List<ProductList_m> data, String message, boolean status, int totalcount) {
        Data = data;
        this.message = message;
        this.status = status;
        this.totalcount = totalcount;
    }

    public List<ProductList_m> getData() {
        return Data;
    }

    public void setData(List<ProductList_m> data) {
        Data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(int totalcount) {
        this.totalcount = totalcount;
    }
}
