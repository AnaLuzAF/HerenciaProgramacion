package org.iesfm.vehiculos;
import java.util.Objects;

public class Moto  extends Vehiculo {
    private int cilindrada;



    public Moto(int numeroKmRecorridos, String color, String matricula, int cilindrada) {
        super(numeroKmRecorridos, color, matricula);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return cilindrada == moto.cilindrada;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cilindrada);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                '}';
    }

    @Override
    public void infoVehiculo() {

        System.out.println(this.toString());
    }
}