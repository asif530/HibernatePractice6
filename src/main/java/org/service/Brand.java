package org.service;

import javax.persistence.Embeddable;

@Embeddable
public class Brand {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
