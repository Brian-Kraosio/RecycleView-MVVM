package com.example.viewmodel.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewmodel.R;
import com.example.viewmodel.databinding.FragmentHomeBinding;
import com.example.viewmodel.models.CustData;
import com.example.viewmodel.recycleView.MyAdapter;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {


    private String mParam2;
    // TODO: Rename and change types of parameters
     private String mParam1;

    private List<CustData> customerData;
    private FragmentHomeBinding binding;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.customerData = new ArrayList<>();
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));
        customerData.add(new CustData("Brian", "Laptop", "150000"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false);
        MyAdapter myAdapter = new MyAdapter(customerData, getContext());
        binding.recycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.setMyAdapter(myAdapter);

        return binding.getRoot();
    }

}