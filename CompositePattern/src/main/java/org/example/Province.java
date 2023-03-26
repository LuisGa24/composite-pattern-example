package org.example;

import java.util.ArrayList;
import java.util.List;

public class Province implements Place {
    private String name;
    private List<Place> cantons;

    public Province(String name) {
        this.name = name;
        this.cantons = new ArrayList<>();
    }

    public void addCanton(Canton canton) {
        cantons.add(canton);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        double totalArea = 0;
        for (Place place : cantons) {
            totalArea += place.getArea();
        }
        return totalArea;
    }

    @Override
    public int getPopulation() {
        int totalPopulation = 0;
        for (Place place : cantons) {
            totalPopulation += place.getPopulation();
        }
        return totalPopulation;
    }

    @Override
    public List<Place> getPlaces() {
        return cantons;
    }

    @Override
    public void print() {
        System.out.println("\tProvince: " + name);
        System.out.println("\tArea: " + getArea());
        System.out.println("\tPopulation: " + getPopulation());
        System.out.println("\tCantons: ");
        for (Place place : cantons) {
            place.print();
        }
    }
}

