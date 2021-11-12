package org.iesfm.vehiculos;
import java.util.Objects;

public class Camion extends Vehiculo {
    private int pesoMaximo;

    public Camion(int numeroKmRecorridos, String color, String matricula, int pesoMaximo) {
        super(numeroKmRecorridos, color, matricula);
        this.pesoMaximo = pesoMaximo;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camion camion = (Camion) o;
        return pesoMaximo == camion.pesoMaximo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesoMaximo);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "pesoMaximo=" + pesoMaximo +
                '}';
    }

    @Override
    public void infoVehiculo() {
        System.out.println(this.toString());
    }

}