package org.example.Biblioteca;
public class Persona {
    private String nombre;
    private String dni;
    private int edad;
    private String ciudad;
    private String profesion;
    // constructor de la clase persona
    public Persona(String nombre, String dni, int edad, String ciudad, String profesion) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.ciudad = ciudad;
        this.profesion = profesion;
    }
    //métodos getter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    // métodos setter para modificar a los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setEdad(int edad) {
        this.edad = edad;
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
    //método para mostrar la información de la persona
    public void mostrarInformacion(){
        System.out.println("nombre = " + nombre);
        System.out.println("dni = " + dni);
        System.out.println("edad = " + edad);
        System.out.println("ciudad = " + ciudad);
        System.out.println("profesion = " + profesion);
    }
}
