package org.example.Biblioteca;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Paco");
        Estudiante estudiante2 = new Estudiante("Paco", "2ºESO", "noseque@edu.gva.es");

        System.out.println(estudiante1);
        System.out.println(estudiante2);

        if (Estudiante.validarEmail(estudiante2.getEmail())) {
            System.out.println("El email es correcto");
        } else {
            System.out.println("El email no cumple con el formato");
        }

        Editorial editorial1 = new Editorial("ANAYA", "ESPAÑA");
        System.out.println(editorial1);

        Libro libro1 = new Libro("El Principito", "Quevedo", editorial1);
        System.out.println(libro1);

        Libro libro2 = new Libro("Tiburón", "Torres", editorial1);
        System.out.println(libro2);

        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());

        Prestamo prestamo1 = libro1.prestar(estudiante2);
        if (prestamo1 != null) {
            System.out.println("Préstamo realizado: " + prestamo1);
        }

        System.out.println(estudiante2);
        System.out.println(libro1);
        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());

        libro1.devolver(estudiante2);
        System.out.println(libro1);
        System.out.println(estudiante2);
        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());

        // Intentar devolver nuevamente para probar la validación
        libro1.devolver(estudiante2);

        libro1.estaDisponible();

        Persona persona1 = new Persona("Marta", "48349599J", 28, "Alicante", "Fontanero" );

    }
}
