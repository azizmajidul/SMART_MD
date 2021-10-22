package com.stmikbanisaleh.smart_md.remote_access;

import com.stmikbanisaleh.smart_md.Model.Audit.PagingRespon;
import com.stmikbanisaleh.smart_md.Model_Ok.Login.LoginReaquest;
import com.stmikbanisaleh.smart_md.Model_Ok.Login.ResponLogin;
import com.stmikbanisaleh.smart_md.Model_Ok.Login2.Entity.AuthorizationRespon;
import com.stmikbanisaleh.smart_md.Model_Ok.Login2.Entity.UserRespon;
import com.stmikbanisaleh.smart_md.Model_Ok.Store.PagingResponProduct;
import com.stmikbanisaleh.smart_md.Model_Ok.Visit.PagingResponStore_v;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface API {

    //interface adalah deklarasi semacam kelas yang methodnya tidak memiliki content
    @GET("API/jadwal")
    Call<PagingRespon> getlist();

    @GET("API/store_visit")
    Call<PagingResponStore_v> getListStore_visit();

    @GET("API/GetProductList")
    Call<PagingResponProduct>getProductList();


//    @Headers("Content-Type: application/json")
    @POST("API/Auth_api")
    Call<ResponLogin> auth(@Body LoginReaquest loginReaquest);

    @Headers("Accept : application/json")
    @GET("API/Auth_api")
    Call<AuthorizationRespon> login(@Header("Authorization") String authorization);


//    @Headers("Content-Type: application/json")
    @GET("API/data_user_api/{id}")
    Call<UserRespon> getUser(@Header("Authorization") String authorization, @Path("id") String id);






}
