package com.example.viewmodel.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.viewmodel.models.CustData;

import java.util.List;

public class CustViewModel extends ViewModel {
    private MutableLiveData<List<CustData>> custDataLive;
    List<CustData> custDataList;

    public CustViewModel() {
        custDataLive = new MutableLiveData<>();
    }

    public MutableLiveData<List<CustData>> getCustData() {
        return custDataLive;
    }

    public void init(){
        addData();
        custDataLive.setValue(custDataList);
    }

    public void addData(){
        CustData custData = new CustData();
        
    }
}
