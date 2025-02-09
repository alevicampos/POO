package app_persona;

public class ClasePrincipalDos {
    public static void main(String[] args) {
        //creación de dos objetos Persona
        Persona persona1 = new Persona("Juan Pérez", "12345678A", 30, "Alicante", "Fontanero");
        Persona persona2 = new Persona("Ana García", "87654321B", 25,"Denia","Programador" );
        Persona persona_sin_edad = new Persona("Carlos Díaz", "547896514A");
        Persona persona3 = new Persona();
//        System.out.println(persona1.nombre);
//        System.out.println(persona2.nombre);
//        System.out.println(persona_sin_edad.nombre+ " " + persona_sin_edad.edad);
//        System.out.println(persona3.nombre);

        // mostrando la información de las dos personas mediante el método mostrarInformacion()
        persona1.mostrarInformacion();
        System.out.println();
        persona2.mostrarInformacion();

        // ejemplo de uso de los getters y setters
        persona1.setNombre("Juan Ruiz");
        System.out.println("Nuevo nombre de persona1: " + persona1.getNombre());
    }
}

