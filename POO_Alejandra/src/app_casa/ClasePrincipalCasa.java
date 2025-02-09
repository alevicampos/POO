package app_casa;

public class ClasePrincipalCasa {
    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio",40);
        casa.agregarHabitacion("Cocina",50);
        casa.agregarHabitacion("Baño",70);

        casa.mostrarHabitaciones();

        System.out.println("La habitación más grande es " + casa.getHabitacionMasGrande());

        casa.borrarHabitacion("Baño");
        casa.borrarHabitacion("Baño");

        casa.getHabitaciones().get(0).agregarElectrodomestico("tv",23);
        casa.getHabitaciones().get(1).agregarElectrodomestico("tv",30);
        System.out.println(casa.getHabitaciones());

        casa.calcularHabitacionMasConsumo();
    }
}

