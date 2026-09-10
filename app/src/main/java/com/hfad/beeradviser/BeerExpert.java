package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Java pura (POJO) que decide qué cervezas recomendar
 * segun el color preferido. No conoce nada de Android.
 * Basada en el ejemplo del libro Head First Android Development.
 */
public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        switch (color) {
            case "light":
                brands.add("Jail Pale Ale");
                brands.add("Gout Stout");
                break;
            case "amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                break;
            case "brown":
                brands.add("Brown Bear Beer");
                brands.add("Bock Bock");
                break;
            case "dark":
                brands.add("Black Death Porter");
                brands.add("Stein Stout");
                break;
            default:
                brands.add("No hay recomendaciones para este color.");
        }
        return brands;
    }
}
