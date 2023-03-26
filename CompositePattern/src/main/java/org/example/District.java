package org.example;

import java.util.List;

public class District implements Place {
    private String name;
    private double area;
    private int population;

    public District(String name, double area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public List<Place> getPlaces() {
        return null;
    }

    @Override
    public void print() {
        System.out.println("\t\t\tDistrict: " + name);
        System.out.println("\t\t\tArea: " + getArea());
        System.out.println("\t\t\tPopulation: " + getPopulation());
        System.out.println("\t\t\t--------------");
    }
}