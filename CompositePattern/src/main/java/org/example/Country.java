package org.example;

import java.util.ArrayList;
import java.util.List;

public class Country implements Place {
    private String name;
    private List<Place> provinces;

    public Country(String name) {
        this.name = name;
        this.provinces = new ArrayList<>();
    }

    public void addProvince(Province province) {
        provinces.add(province);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        double totalArea = 0;
        for (Place place : provinces) {
            totalArea += place.getArea();
        }
        return totalArea;
    }

    @Override
    public int getPopulation() {
        int totalPopulation = 0;
        for (Place place : provinces) {
            totalPopulation += place.getPopulation();
        }
        return totalPopulation;
    }

    @Override
    public List<Place> getPlaces() {
        return provinces;
    }

    @Override
    public void print() {
        System.out.println("Country: " + name);
        System.out.println("Area: " + getArea());
        System.out.println("Population: " + getPopulation());
        System.out.println("Provinces: ");
        for (Place place : provinces) {
            place.print();
        }
    }
}
