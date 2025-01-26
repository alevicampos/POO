package org.example;

public class Libro {

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;


    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;

        this.id = calcularId();

        cantidadLibros++;
        librosDisponibles++;
    }


    private String calcularId() {
        return String.format("LIB%03d", cantidadLibros + 1);
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            librosDisponibles--;
            System.out.println("El libro ha sido prestado con éxito.");
            return true;
        } else {
            System.out.println("El libro no se puede prestar porque ya está prestado.");
            return false;
        }
    }

    public boolean devolver() {
        if (!disponible) {
            disponible = true;
            librosDisponibles++;
            System.out.println("El libro ha sido devuelto con éxito.");
            return true;
        } else {
            System.out.println("El libro no se puede devolver porque ya estaba disponible.");
            return false;
        }
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public static int getTotalLibros() {
        return cantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
