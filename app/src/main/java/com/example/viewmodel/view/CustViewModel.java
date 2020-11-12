package com.example.viewmodel.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.viewmodel.databinding.FragmentHomeBinding;
import com.example.viewmodel.models.CustData;
import com.example.viewmodel.repositories.custDataRepo;

import java.util.ArrayList;
import java.util.List;

public class CustViewModel extends ViewModel {
    private MutableLiveData<List<CustData>> custDataLive;
    private List<CustData> dataset = null;
    private custDataRepo repo;
    private FragmentHomeBinding binding;


    public CustViewModel(List<CustData> dataset) {
        this.dataset = dataset;
        this.custDataLive.setValue(dataset);
    }

    public LiveData<List<CustData>> getCustData(){
        return custDataLive;
    }

    public void addValue(){

        this.dataset.add(new CustData("Eko", "Kontol","9999999"));
        this.custDataLive.setValue(dataset);
    }
}
