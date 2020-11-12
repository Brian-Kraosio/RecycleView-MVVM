package com.example.viewmodel.models;

public class CustData {
    private String name;
    private String goods;
    private String total;

    public CustData(String name, String goods, String total) {
        this.name = name;
        this.goods = goods;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
