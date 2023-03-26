package org.example;

// Client code
public class Main {
    public static void main(String[] args) {
        // Create Costa Rica
        Country costaRica = new Country("Costa Rica");

        // Create Cartago province and its cantons and districts
        Province cartago = new Province("Cartago");
        cartago.addCanton(new Canton("Cartago"));
        cartago.addCanton(new Canton("La Unión"));

        Canton cartagoCanton = (Canton) cartago.getPlaces().get(0);
        cartagoCanton.addDistrict(new District("Cartago", 287.77, 156600));
        cartagoCanton.addDistrict(new District("Oriental", 3.03, 1503));

        Canton laUnionCanton = (Canton) cartago.getPlaces().get(1);
        laUnionCanton.addDistrict(new District("Tres Ríos", 7.85, 14448));
        laUnionCanton.addDistrict(new District("San Diego", 7.35, 7588));

        costaRica.addProvince(cartago);

        // Create San José province and its cantons and districts
        Province sanJose = new Province("San José");
        sanJose.addCanton(new Canton("San José"));
        sanJose.addCanton(new Canton("Escazú"));

        Canton sanJoseCanton = (Canton) sanJose.getPlaces().get(0);
        sanJoseCanton.addDistrict(new District("Catedral", 4.96, 37285));
        sanJoseCanton.addDistrict(new District("Zapote", 6.86, 20675));

        Canton escazuCanton = (Canton) sanJose.getPlaces().get(1);
        escazuCanton.addDistrict(new District("Escazú", 34.39, 61680));
        escazuCanton.addDistrict(new District("San Antonio", 34.25, 16185));

        costaRica.addProvince(sanJose);

        // Print the structure
        System.out.println("Costa Rica:");
        costaRica.print();

    }
}