package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creación de los objetos Persona
        Persona persona1 = new Persona("Juan", "48349599b", 30, "Alicante", "Profesor");
        Persona persona2 = new Persona("Ana", "48315566g", 25, "Barcelona", "Desarrollador");

        //mostrando la información de las dos personas mediante el método mostrarInformacion()
        persona1.mostrarInformacion();
        System.out.println();
        persona2.mostrarInformacion();

        // ejemplo de uso de lo getters y setters

        persona1.setNombre("Pepe");
        System.out.println("nuevo nombre de persona1: " + persona1.getNombre());

        // Crear instancias de Televisor
        Televisor tv1 = new Televisor(); // Canal: 1, Volumen: 5
        Televisor tv2 = new Televisor(10, 20); // Canal: 10, Volumen: 20

        // Comprobar el estado inicial de cada televisor
        System.out.println("Estado inicial de TV1 - Canal: " + tv1.getCanal() + ", Volumen: " + tv1.getVolumen());
        System.out.println("Estado inicial de TV2 - Canal: " + tv2.getCanal() + ", Volumen: " + tv2.getVolumen());

        // Cambiar el canal y el volumen en tv1
        tv1.subirCanal();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.setCanal(99);
        tv1.subirCanal(); // Intentar pasar del canal 99

        // Cambiar el canal y el volumen en tv2
        tv2.bajarCanal();
        tv2.bajarVolumen();
        tv2.setVolumen(101); // Volumen inválido
        tv2.setCanal(-5); // Canal inválido

        // Mostrar el estado final de cada televisor
        System.out.println("Estado final de TV1 - Canal: " + tv1.getCanal() + ", Volumen: " + tv1.getVolumen());
        System.out.println("Estado final de TV2 - Canal: " + tv2.getCanal() + ", Volumen: " + tv2.getVolumen());

        Paciente paciente1 = new Paciente("Luis",45,'H',90,1.90);
        paciente1.imprimirInfo();
        Paciente paciente2 = new Paciente();
        paciente2.imprimirInfo();
    }
}