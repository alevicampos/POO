package org.example;

import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    public static final String CORREO_VALIDO = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> libroPrestados;

    public Estudiante(String nombre, String curso,String email){

        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        libroPrestados=new ArrayList<Libro>();
    }

    public Estudiante (String nombre){
        this.nombre=nombre;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
    }

    public void  anyadirLibro(Libro libro){
        libroPrestados.add(libro);
    }
    public void borrarLibro(Libro libro){
        libroPrestados.remove(libro);
    }

    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCurso(){
        return curso;
    }

    public int getNia(){
        return nia;
    }

    public String getEmail(){
        return email;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setCurso(String curso){
        this.curso=curso;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public ArrayList<Libro> getLibroPrestado() {
        return libroPrestados;
    }
    public void setLibroPrestado(ArrayList<Libro> libroPrestado) {
        this.libroPrestados = libroPrestado;
    }
    @Override
    public String toString(){
        return "Estudiante : [ nombre=" + getNombre() + " curso=" + getCurso() + " nia=" + getNia() + " email=" + getEmail() + "]";
        if (!libroPrestados.isEmpty()){
            return "Estudiante : [ nombre=" + getNombre() + " curso=" + getCurso() + " nia=" + getNia() + " email=" + getEmail() + " libroPrestado=" + libroPrestados +"]";
        }else{
            return "Estudiante : [ nombre=" + getNombre() + " curso=" + getCurso() + " nia=" + getNia() + " email=" + getEmail() + "]";
        }
    }

//    @Override
//    public String toString() {
//        return "Estudiante{" +
//                "nombre='" + nombre + '\'' +
//                ", curso='" + curso + '\'' +
//                ", nia=" + nia +
//                ", email='" + email + '\'' +
//                ", libroPrestado=" + libroPrestados +
//                '}';
//    }

    public static boolean validarEmail(String email){

        if(email.matches(CORREO_VALIDO)){
            return true;
        }

        return false;
    }




}
