package com.stmikbanisaleh.smart_md.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stmikbanisaleh.smart_md.Model.Audit.Store_list;
import com.stmikbanisaleh.smart_md.Model_Ok.Visit.ListVisit;
import com.stmikbanisaleh.smart_md.R;
import com.stmikbanisaleh.smart_md.Ui.ProductList;

import java.util.ArrayList;
import java.util.List;

public class StoreVisitAdapter extends RecyclerView.Adapter<StoreVisitAdapter.StoreVisitViewHolder> {

    private Context context;
    private List<ListVisit> list = new ArrayList<>();
    private View.OnClickListener listener;


    public StoreVisitAdapter( List<ListVisit> list){
        this.list = list;

    }



    @NonNull
    @Override
    public StoreVisitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        view.setOnClickListener(listener);
        StoreVisitAdapter.StoreVisitViewHolder holder = new StoreVisitAdapter.StoreVisitViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull StoreVisitViewHolder holder, final int position) {

        final ListVisit listVisit = list.get(position);
        holder.store_id.setText(listVisit.getStore_id());
        holder.store_name.setText(listVisit.getStore_name());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ProductList.class);
                intent.putExtra("store_id", list.get(position).getStore_id());
                intent.putExtra("store_name", list.get(position).getStore_name());
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class StoreVisitViewHolder extends RecyclerView.ViewHolder{
        TextView store_id, store_name;

        public StoreVisitViewHolder(@NonNull View itemView) {
            super(itemView);
            store_id = itemView.findViewById(R.id.store_id);
            store_name = itemView.findViewById(R.id.store_name);
        }
    }
}
