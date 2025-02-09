package app_listacompra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListaCompra {
    public static void main(String[] args) {


// a) Crea una nueva lista de la compra y verifica si está vacía. Luego, añade un elemento y verifícalo de nuevo.
        ArrayList<String> ListaCompra = new ArrayList<>();
        System.out.println("ListaCompra = " + ListaCompra);
        ListaCompra.add("Leche");
        System.out.println("ListaCompra = " + ListaCompra);

// b) Añade 5 elementos más, todos a la vez. Muestra el contenido de la lista tras hacerlo.
        ListaCompra.addAll(Arrays.asList("chocolate", "arroz", "pasta", "café", "azucar"));
        System.out.println("ListaCompra = " + ListaCompra);
// c) Muestra el tercer elemento de la lista.
        System.out.println("El elemento 3 de la lista es: "+ListaCompra.get(2));

// d) Cambia el segundo elemento de la lista por "Queso".
        ListaCompra.set(1, "Queso");
        System.out.println("ListaCompra = " + ListaCompra);

// e) Comprueba si un producto específico (por ejemplo, "Leche") está en la lista.
        if(ListaCompra.contains("Leche")){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
// f) Implementa un control para que antes de añadir un nuevo elemento (add) se verifique si ya existe en la lista para evitar duplicados. Haz lo mismo para cuando se modifique un elemento (set).
        if (!ListaCompra.contains("Leche")){
            ListaCompra.add("Leche");
        }else{
            System.out.println("Leche ya está en la lista");
        }
        System.out.println("ListaCompra = " + ListaCompra);
        if (!ListaCompra.contains("Pan")){
            ListaCompra.set(1,"Pan");
        }else{
            System.out.println("El producto ya está en la lista");
        }
        System.out.println("ListaCompra = " + ListaCompra);
// g) Muestra el número de elementos en la lista.
        System.out.println("ListaCompra.size() = " + ListaCompra.size());

// h) Clona la lista actual.
        ArrayList<String> listaClonada = new ArrayList<>(ListaCompra);
        System.out.println("listaClonada = " + listaClonada);

// i) Limpia la lista clonada y verifica que está vacía.

        listaClonada.clear();
        System.out.println("listaClonada = " + listaClonada);

// j) Compara las dos listas y verifica que no sean iguales con el método .equals().
        if(listaClonada.equals(ListaCompra)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

        boolean sonIguales = listaClonada.equals(ListaCompra);
        System.out.println("sonIguales = " + sonIguales);

// k) Añade dos elementos a la lista clonada.
        listaClonada.addAll(Arrays.asList("Hamburguesas","Leche"));

// l) Dada la lista de la compra original, muestra los elementos que faltan en la lista clonada. Usa el método removeAll();

        List<String> elementosFaltantes = new ArrayList<>(ListaCompra);
        elementosFaltantes.removeAll(listaClonada);
        System.out.println("Elementos que faltan en la lista clonada: " + elementosFaltantes);

//  m) Crea otra lista del mismo tamaño que la original y llénala con números enteros aleatorios [0,10], simulando los precios correspondientes a cada producto. Muestra las dos listas.
        ArrayList<Integer> ListaNumeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < ListaCompra.size(); i++) {
            ListaNumeros.add(random.nextInt(11)); // Genera un número entre 0 y 10
        }
        for (int i = 0; i < ListaCompra.size(); i++) {
            System.out.println("El producto " +ListaCompra.get(i)+ " tiene un precio de: " +ListaNumeros.get(i)+ " euros.");

        }

    }
}


