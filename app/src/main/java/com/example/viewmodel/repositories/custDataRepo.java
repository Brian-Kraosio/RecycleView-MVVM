package com.example.viewmodel.repositories;

import androidx.lifecycle.MutableLiveData;

import com.example.viewmodel.databinding.FragmentHomeBinding;
import com.example.viewmodel.models.CustData;

import java.util.ArrayList;
import java.util.List;

public class custDataRepo {
    private static custDataRepo instance;
    private ArrayList<CustData> dataset = new ArrayList<>();
    FragmentHomeBinding binding;
    CustData custData = new CustData(" ", " ", " ");

    public static custDataRepo getInstance(){
        if (instance == null){
            instance = new custDataRepo();
        }
        return instance;
    }

    public MutableLiveData<List<CustData>> getCustData(){
        setCustData();
        MutableLiveData<List<CustData>> data = new MutableLiveData<>();
        data.setValue(dataset);
        return data;

    }

    private void setCustData(){
        dataset.add(new CustData("Brian","Laptop","2000000"));
    }
}
