package org.example.dataTypeConversion.numberFormat;

import java.util.GregorianCalendar;

public class CarEntity {
    private int id;
    private double price;
    private GregorianCalendar manufacturingDate;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(GregorianCalendar manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
