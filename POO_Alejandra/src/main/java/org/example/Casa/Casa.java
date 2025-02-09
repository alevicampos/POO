package org.example.Casa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Casa {
    Scanner entrada = new Scanner(System.in);
    private String direccion;
    private List<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario");
        String nombre = entrada.next();
        System.out.println("Introduce la edad ");
        int edad = entrada.nextInt();
    }

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        //propietaio

        propietario = new Propietario(nombre, edad);
    }

    public void agregarHabitacion(String nombre, double metrosCuadrados) {
        Habitacion habitacion = new Habitacion(nombre); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
        for (Habitacion hab: habitaciones){
            if (hab.getNombre().equals(nombre)){
                System.out.println("La habitación ya existe");
                return;
            }
        }
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene las siguientes habitaciones: " + habitaciones);
        for(Habitacion hab: habitaciones){
            System.out.println("- " + hab.getNombre()+ " (" + hab.getMetrosCuadrados()+ "m2) Propietario"+ propietario.getNombre() );

        }
    }
    public Habitacion getHabitacionMasGrande(){
        Habitacion aux= habitaciones.get(0);
        for (Habitacion hab: habitaciones){
            if(hab.getMetrosCuadrados()>aux.getMetrosCuadrados()){
                aux = hab;
            }
        }
        return aux;
    }
    public void eliminarHabitacion(String nombre){
        for (Habitacion hab: habitaciones){
            if(hab.getNombre().equals(nombre)){
                habitaciones.remove();
            }
        }
    }
}

