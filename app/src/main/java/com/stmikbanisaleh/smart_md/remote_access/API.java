package com.stmikbanisaleh.smart_md.remote_access;

import com.stmikbanisaleh.smart_md.Model.Audit.PagingRespon;
import com.stmikbanisaleh.smart_md.Model_Ok.Store.PagingResponProduct;
import com.stmikbanisaleh.smart_md.Model_Ok.Visit.PagingResponStore_v;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {

    //interface adalah deklarasi semacam kelas yang methodnya tidak memiliki content
    @GET("API/jadwal")
    Call<PagingRespon> getlist();

    @GET("API/store_visit")
    Call<PagingResponStore_v> getListStore_visit();

    @GET("API/GetProductList")
    Call<PagingResponProduct>getProductList();
}
