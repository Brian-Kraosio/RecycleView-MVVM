package com.example.viewmodel.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewmodel.R;
import com.example.viewmodel.databinding.FragmentHomeBinding;
import com.example.viewmodel.models.CustData;
import com.example.viewmodel.recycleView.MyAdapter;
import com.example.viewmodel.view.CustViewModel;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {


    private String mParam2;
    // TODO: Rename and change types of parameters
     private String mParam1;

    private List<CustData> customerData;
    private FragmentHomeBinding binding;
    public CustViewModel viewmodel;
    MyAdapter myAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false);
        binding.setLifecycleOwner(this);
        viewmodel = new ViewModelProvider(this).get(CustViewModel.class);
//        viewmodel.init();
        viewmodel.getCustData().observe(getViewLifecycleOwner(), new Observer<List<CustData>>() {
            @Override
            public void onChanged(List<CustData> custDataList) {
                myAdapter.setCustDataList(custDataList);
            }
        });

        myAdapter = new MyAdapter(viewmodel.getCustData().getValue(), getContext());
        binding.recycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.setMyAdapter(myAdapter);
        binding.setViewModel(viewmodel);

        return binding.getRoot();
    }
}