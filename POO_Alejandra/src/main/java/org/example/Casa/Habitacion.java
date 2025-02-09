package org.example.Casa;

class Habitacion {
    private String nombre;
    private double metrosCuadrados;

    public Habitacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public void agregarElectrodomestico(){

    }



    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + getNombre() + '\'' +
                ", metrosCuadrados=" + getMetrosCuadrados() +
                '}';
    }
}
