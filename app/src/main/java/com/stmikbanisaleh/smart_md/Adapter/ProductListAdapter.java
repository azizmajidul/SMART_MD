package com.stmikbanisaleh.smart_md.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stmikbanisaleh.smart_md.Model_Ok.Store.ProductList_m;
import com.stmikbanisaleh.smart_md.Model_Ok.Visit.ListVisit;
import com.stmikbanisaleh.smart_md.R;
import com.stmikbanisaleh.smart_md.Ui.ProductList;

import java.util.ArrayList;
import java.util.List;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductListViewHolder> {

    private Context context;
    private List<ProductList_m> list = new ArrayList<>();
    private View.OnClickListener listener;

    public ProductListAdapter(List<ProductList_m> list){
        this.list = list;
    }

    @NonNull
    @Override
    public ProductListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list, parent, false);
        view.setOnClickListener(listener);
        ProductListAdapter.ProductListViewHolder holder = new ProductListAdapter.ProductListViewHolder(view);
       return  holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ProductListViewHolder holder, int position) {

        final  ProductList_m productList_m = list.get(position);
        holder.product.setText(productList_m.getProduct_name());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  static  class ProductListViewHolder extends RecyclerView.ViewHolder{
        TextView product;

        public ProductListViewHolder(@NonNull View itemView) {
            super(itemView);
            product = itemView.findViewById(R.id.produk_name);
        }
    }
}
