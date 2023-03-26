package org.example;

import java.util.List;

public interface Place {
    String getName();
    double getArea();
    int getPopulation();
    List<Place> getPlaces();
    void print();


}

