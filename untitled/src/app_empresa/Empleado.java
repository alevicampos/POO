package app_empresa;

import java.util.ArrayList;
import java.util.List;

class Empleado {
    private String nombre;
    private String puesto;
    private Empleado supervisor; // RELACIÓN REFLEXIVA (Un empleado puede tener un supervisor)
    private List<Empleado> companeros; // Lista de compañeros de trabajo

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.supervisor = null;  // No tiene supervisor inicialmente
        this.companeros = new ArrayList<>(); // Inicializar la lista de compañeros
    }

    // Método para asignar supervisor con validación
    public void asignarSupervisor(Empleado supervisor) {
        if (supervisor == this) {
            System.out.println("Error: Un empleado no puede ser su propio supervisor.");
            return;
        }
        this.supervisor = supervisor;
    }

    // Método para agregar compañeros de trabajo
    public void agregarCompanero(Empleado companero) {
        if (companero == this) {
            System.out.println("Error: Un empleado no puede ser su propio compañero.");
            return;
        }
        if (!companeros.contains(companero)) {
            companeros.add(companero);
            companero.getCompaneros().add(this); // Relación bidireccional
        }
    }

    // Método para obtener supervisor
    public Empleado getSupervisor() {
        return supervisor;
    }

    // Método para obtener compañeros de trabajo
    public List<Empleado> getCompaneros() {
        return companeros;
    }

    // Método para mostrar la información del empleado
    public void mostrarInfo() {
        System.out.println("app_empresa.Empleado: " + nombre + " - Puesto: " + puesto);

        if (supervisor != null) {
            System.out.println("Supervisor: " + supervisor.getNombre());
        } else {
            System.out.println("Este empleado no tiene supervisor.");
        }

        if (!companeros.isEmpty()) {
            System.out.print("Compañeros: ");
            for (Empleado companero : companeros) {
                System.out.print(companero.getNombre() + " ");
            }
            System.out.println();
        } else {
            System.out.println("Este empleado no tiene compañeros de trabajo.");
        }
    }

    // Método toString para facilitar la impresión de información
    @Override
    public String toString() {
        return "app_empresa.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", supervisor=" + (supervisor != null ? supervisor.getNombre() : "Ninguno") +
                ", compañeros=" + companeros.stream().map(Empleado::getNombre).toList() +
                '}';
    }

    public String getNombre() {
        return nombre;
    }
}

