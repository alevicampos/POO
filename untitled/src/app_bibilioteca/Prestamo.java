package app_bibilioteca;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prestamo {
    Estudiante estudiante;
    Libro libro;
    private LocalDate fecha;

    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;

    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "estudiante=" + getEstudiante() +
                ", libro=" + getLibro() +
                ", fecha=" + getFecha() +
                '}';
    }
}
