package org.iesfm.vehiculos;


import java.util.Objects;

public class Coche extends Vehiculo {
    private int numeroPlazas;
    private String tipoCombustible;

    public Coche(int numeroPlazas,String tipoCombustible,int numeroKmRecorridos, String color, String matricula) {
        super(numeroKmRecorridos, color, matricula);
        this.numeroPlazas=numeroPlazas;
        this.tipoCombustible=tipoCombustible;
    }


    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coche coche = (Coche) o;
        return numeroPlazas == coche.numeroPlazas && Objects.equals(tipoCombustible, coche.tipoCombustible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroPlazas, tipoCombustible);
    }



    @Override
    public void infoVehiculo() {
        System.out.println(this.toString());
    }
}