package app_persona;

public class Persona {
    private String nombre;
    private String dni;
    private int edad;
    private String ciudad;
    private String profesion;

    // constructor parametrizado de la clase Persona
    public Persona(String nombre, String dni, int edad, String ciudad, String profesion) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.ciudad = ciudad;
        this.profesion = profesion;
    }
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    // constructor por defecto de la clase Persona
    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // método para mostrar la información de la persona
    public void mostrarInformacion(){
        System.out.println("nombre = " + nombre);
        System.out.println("dni = " + dni);
        System.out.println("edad = " + edad);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
