package com.example.viewmodel.recycleView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewmodel.BR;
import com.example.viewmodel.R;
import com.example.viewmodel.databinding.RowViewBinding;
import com.example.viewmodel.models.CustData;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<CustData> custDataList;
    private Context context;

    public MyAdapter(List<CustData> custDataList, Context context) {
        this.custDataList = custDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowViewBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.row_view,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CustData custData = custDataList.get(position);
        holder.bind(custData);
    }

    @Override
    public int getItemCount() {
        return custDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public RowViewBinding bindingView;

        public ViewHolder(@NonNull RowViewBinding bindingView) {
            super(bindingView.getRoot());
            this.bindingView = bindingView;
        }
        public void bind(CustData custData) {
            bindingView.setCustomerData(custData);
            bindingView.executePendingBindings();
        }
    }
}
