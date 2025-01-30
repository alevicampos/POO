package org.example;

import java.util.ArrayList;
import java.util.Random;

public class ListaCompra {
    public static void main(String[] args) {
        // a) Crear una nueva lista de la compra y verificar si está vacía
        ArrayList<String> listaCompra = new ArrayList<>();
        System.out.println("¿Lista vacía? " + listaCompra.isEmpty());

        // Añadir un elemento y verificar nuevamente
        listaCompra.add("Pan");
        System.out.println("¿Lista vacía después de añadir un elemento? " + listaCompra.isEmpty());

        // b) Añadir 5 elementos más de una vez y mostrar la lista
        listaCompra.addAll(java.util.List.of("Leche", "Huevos", "Manzanas", "Arroz", "Pollo"));
        System.out.println("Lista de la compra: " + listaCompra);

        // c) Mostrar el tercer elemento de la lista
        System.out.println("Tercer elemento: " + listaCompra.get(2));

        // d) Cambiar el segundo elemento por "Queso"
        listaCompra.set(1, "Queso");
        System.out.println("Lista después de cambiar el segundo elemento: " + listaCompra);

        // e) Comprobar si "Leche" está en la lista
        System.out.println("¿La lista contiene 'Leche'? " + listaCompra.contains("Leche"));

        // f) Control para evitar duplicados al añadir o modificar
        agregarElemento(listaCompra, "Queso"); // Ya está, no lo añadirá
        agregarElemento(listaCompra, "Tomates"); // No está, lo añadirá
        modificarElemento(listaCompra, 1, "Leche"); // Se cambia por "Leche"
        modificarElemento(listaCompra, 2, "Leche"); // Ya existe, no se cambia
        System.out.println("Lista tras agregar/verificar duplicados: " + listaCompra);

        // g) Mostrar el número de elementos en la lista
        System.out.println("Número de elementos en la lista: " + listaCompra.size());

        // h) Clonar la lista actual
        ArrayList<String> listaClonada = new ArrayList<>(listaCompra);
        System.out.println("Lista clonada: " + listaClonada);

        // i) Limpiar la lista clonada y verificar que está vacía
        listaClonada.clear();
        System.out.println("¿Lista clonada vacía después de limpiar? " + listaClonada.isEmpty());

        // j) Comparar las dos listas con .equals()
        boolean sonIguales = listaCompra.equals(listaClonada);
        System.out.println("¿Las listas son iguales? " + sonIguales);

        // k) Añadir dos elementos a la lista clonada
        listaClonada.add("Pasta");
        listaClonada.add("Jugo");
        System.out.println("Lista clonada después de agregar elementos: " + listaClonada);

        // l) Mostrar los elementos faltantes en la lista clonada
        ArrayList<String> faltantes = new ArrayList<>(listaCompra);
        faltantes.removeAll(listaClonada);
        System.out.println("Elementos faltantes en la lista clonada: " + faltantes);

        // m) Crear una lista de precios aleatorios
        ArrayList<Integer> precios = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listaCompra.size(); i++) {
            precios.add(random.nextInt(11)); // Precios entre 0 y 10
        }
        System.out.println("Lista de productos: " + listaCompra);
        System.out.println("Lista de precios: " + precios);
    }

    // Método para agregar elementos sin duplicados
    public static void agregarElemento(ArrayList<String> lista, String elemento) {
        if (!lista.contains(elemento)) {
            lista.add(elemento);
        } else {
            System.out.println("El elemento '" + elemento + "' ya está en la lista.");
        }
    }

    // Método para modificar elementos evitando duplicados
    public static void modificarElemento(ArrayList<String> lista, int indice, String nuevoElemento) {
        if (!lista.contains(nuevoElemento)) {
            lista.set(indice, nuevoElemento);
        } else {
            System.out.println("No se puede modificar. '" + nuevoElemento + "' ya está en la lista.");
        }
    }
}

