package org.iesfm.vehiculos;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Coche c = new Coche(6, "Diesel", 1200, "Rojo", "4546446J");
        c.infoVehiculo();
        c.run(1220);
        c.infoVehiculo();

    }
}