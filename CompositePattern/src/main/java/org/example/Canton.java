package org.example;

import java.util.ArrayList;
import java.util.List;

public class Canton implements Place {
    private String name;
    private List<Place> districts;

    public Canton(String name) {
        this.name = name;
        this.districts = new ArrayList<>();
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        double totalArea = 0;
        for (Place place : districts) {
            totalArea += place.getArea();
        }
        return totalArea;
    }

    @Override
    public int getPopulation() {
        int totalPopulation = 0;
        for (Place place : districts) {
            totalPopulation += place.getPopulation();
        }
        return totalPopulation;
    }

    @Override
    public List<Place> getPlaces() {
        return districts;
    }

    @Override
    public void print() {
        System.out.println("\t\tCanton: " + name);
        System.out.println("\t\tArea: " + getArea());
        System.out.println("\t\tPopulation: " + getPopulation());
        System.out.println("\t\tDistricts: ");
        for (Place place : districts) {
            place.print();
        }
    }
}
