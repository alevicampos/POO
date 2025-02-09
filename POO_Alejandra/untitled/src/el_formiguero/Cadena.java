package el_formiguero;

import app_casa.Electrodomestico;

import java.util.ArrayList;

public class Cadena {
    //Atributos
    private String nombre;
    private ArrayList<Programa> listaProgramas;

    //constructor
    public Cadena(String nombre) {
        this.nombre = nombre;
        //se crea sin programas y se van añadiendo conforme se van creando programas
        this.listaProgramas = new ArrayList<>();
    }
    // método para añadir programas
    public void agregarPrograma(Programa programa){
        listaProgramas.add(programa);
        //La clase Cadena y la clase Programa tienen relación de tipo asociación/agregación bidireccional
        programa.setCadena(this);
    }
    //metodo para eliminar programas
    public void eliminarPrograma(Programa programa){
        listaProgramas.remove(programa);
        //elimina la relación bidireccional en caso de eliminar un programa
        programa.setCadena((null));

    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }
    //método toString
    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}


