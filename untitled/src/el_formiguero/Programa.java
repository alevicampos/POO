package el_formiguero;

import java.util.ArrayList;

public class Programa {
    //Atributos
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    // Constructor
    public Programa(String nombre, Cadena cadena, Empleado director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.director = director;
        this.listaEmpleados = new ArrayList<>();//por defecto no tendremos empleados
        this.listaInvitados = new ArrayList<>();//por defecto no tendremos invitados
        this.listaEmpleados.add(director);//excepto director
    }

    //método para añadir Empleados:
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }
    //metodo para eliminar empleados;
    public void  eliminarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }
    //metodo para añadir invitados:
    public void agregarInvitados(Invitado invitado){
        listaInvitados.add(invitado);
    }
    //metodo para eliminar invitados:
    public void eliminarInvitados(Invitado invitado){
        listaInvitados.remove(invitado);
    }
    //método que muestra cuántos invitados han acudido al Programa dada una temporada
    public void invitadosTemporada(int temporada){
        System.out.println("Al programa de la temporada" + temporada + " han acudido"+ listaInvitados.size()+" invitados: ");
        //Muestra también sus nombres y profesiones.
        for(Invitado invitado: listaInvitados){
            if(invitado.getTemporada() == temporada) {
                System.out.println("Nombre: "+ invitado.getNombre()+ ", Profesion: " +invitado.getProfesion());
            }
        }
    }
    // Método que devuelva las veces que ha ido un Invitado al Programa.
    public int vecesInvitado(String nombre){
        int contador= 0;
        for(Invitado invitado : listaInvitados){
            if(invitado.getNombre().equalsIgnoreCase(nombre)){
                contador ++;
            }
        }
        return contador;
    }
    // Método que haga uso del método vecesInvitado
    //e imprime las veces que ha ido un Invitado al Programa,
    public void rastrearInvitado(String nombre) {
        System.out.println("El invitado " + nombre + " ha ido al programa " + vecesInvitado(nombre)+" veces.");
        // mostrar en qué fechas y temporadas.
        for(Invitado invitado : listaInvitados){
            if(invitado.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Fecha: "+invitado.getFecha_visita() + ", Temporada: " + invitado.getTemporada());
            }
        }
    }
    // Método para que dado un Invitado sea capaz de buscar si ha acudido a un Programa.
    public boolean buscarInvitado(String nombre) {
        for(Invitado invitado: listaInvitados){
            if(invitado.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    //Método que usa el método buscarInvitado(String nombre)
    // para que en caso de haber devuelto true buscando en dos Programas distintos,
    // muestre en cuál ha estado antes.
    public void invitadoAntes(String nombre){

    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    //Metodo toString


    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", temporadas=" + temporadas +
                ", director=" + director +
                '}';
    }
}


