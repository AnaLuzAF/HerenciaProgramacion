package org.iesfm.vehiculos;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
//al ser abstract no podemos inicializar objetos de tipo vehiculo,
//tiene que ser o camión, coche o moto

public abstract class Vehiculo {
    private int numeroKmRecorridos;
    private String color;
    private String matricula;

    public Vehiculo(int numeroKmRecorridos, String color, String matricula) {
        this.numeroKmRecorridos = numeroKmRecorridos;
        this.color = color;
        this.matricula = matricula;
    }

    public int getNumeroKmRecorridos() {
        return numeroKmRecorridos;
    }

    public void setNumeroKmRecorridos(int numeroKmRecorridos) {
        this.numeroKmRecorridos = numeroKmRecorridos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculos = (Vehiculo) o;
        return numeroKmRecorridos == vehiculos.numeroKmRecorridos && Objects.equals(color, vehiculos.color) && Objects.equals(matricula, vehiculos.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroKmRecorridos, color, matricula);
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "numeroKmRecorridos=" + numeroKmRecorridos +
                ", color='" + color + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    public abstract void infoVehiculo();


    public void run(int numeroKmAnadidos){
       numeroKmRecorridos+= numeroKmAnadidos;

    }

}