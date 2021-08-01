package model;

import model.interfaces.Wowclass;

public class Hunter implements Wowclass {
    public String name;
    public String specialization;
    public int price;

    public Hunter(String name, String specialization, int price) {
        this.name = name;
        this.specialization = specialization;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSpecialization() {
        return specialization;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
