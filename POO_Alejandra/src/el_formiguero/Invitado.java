package el_formiguero;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Invitado {
    //Atributos:
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;


    //constructor
    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        // Modifico el constructor de Invitados para que llame al set de fecha_visita
        this.fecha_visita = setFecha_visita();
    }

    //getters y setters
    public LocalDate setFecha_visita() {
        //vamos a preguntar al usuario para guardar cuándo tienen que ir al Programa.
        Scanner entrada = new Scanner(System.in);
        //controlo que los valores introducidos sean válidos
        while (true) {
            try {
                System.out.println("Introduce el año de la visita: ");
                int anyo = entrada.nextInt();
                System.out.println("Introduce el mes de la visita: ");
                int mes = entrada.nextInt();
                System.out.println("Introduce el dia de la visita: ");
                int dia = entrada.nextInt();
                //LocalDate fecha = LocalDate.of(2025, 03, 15);
                return LocalDate.of(anyo, mes, dia);
            } catch (InputMismatchException error) {
                System.out.println("La fecha introducida no es válida");
                entrada.nextLine();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }



    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    //metodo toString

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}


