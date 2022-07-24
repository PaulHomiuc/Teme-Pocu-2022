package com.ShopManager;

import java.util.ArrayList;

public class Shop {
    String domain;
    String name;
    int openingYear;
    ArrayList<Product>  products;
    public Shop(String domain, String name, ArrayList<Product> products,int openingYear){
        this.domain=domain;
        this.name=name;
        this.products=products;
        this.openingYear=openingYear;

    }

    public int getOpeningYear() {
        return openingYear;
    }

    public void setOpeningYear(int openingYear) {
        this.openingYear = openingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
