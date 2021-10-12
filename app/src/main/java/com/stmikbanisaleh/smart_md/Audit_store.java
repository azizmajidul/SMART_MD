package com.stmikbanisaleh.smart_md;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.stmikbanisaleh.smart_md.Adapter.Store_listAdapter;
import com.stmikbanisaleh.smart_md.Model.Audit.Store_list;
import com.stmikbanisaleh.smart_md.Model.Audit.PagingRespon;
import com.stmikbanisaleh.smart_md.remote_access.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Audit_store extends AppCompatActivity {

    private RecyclerView recyclerView = null;
    private List<Store_list> list = new ArrayList<>();
    private Store_listAdapter adapter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audit_store);
        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        final Audit_store activity = this;
        Call<PagingRespon> call = RetrofitClient.getInstance().getApi().getlist();
        call.enqueue(new Callback<PagingRespon>() {
            @Override
            public void onResponse(Call<PagingRespon> call, Response<PagingRespon> response) {
                list = response.body().getData();
                //adapter = new Store_listAdapter(activity, Store_list.initData());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<PagingRespon> call, Throwable t) {

            }
        });


//        adapter = new Store_listAdapter(this, Store_list.initData());
//        recyclerView.setAdapter(adapter);

    }
}