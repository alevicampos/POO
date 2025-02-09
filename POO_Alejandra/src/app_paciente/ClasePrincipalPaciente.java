package app_paciente;

import java.util.Scanner;

public class ClasePrincipalPaciente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese sexo (H/M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Ingrese peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese altura (m): ");
        double altura = scanner.nextDouble();

        // Crear objetos
        Paciente p1 = new Paciente(nombre, edad, sexo, peso, altura);
        Paciente p2 = new Paciente(nombre, edad, sexo);
        Paciente p3 = new Paciente();
        p3.setNombre("Carlos");
        p3.setEdad(30);
        p3.setSexo('H');
        p3.setPeso(75);
        p3.setAltura(1.75);

        // Evaluación
        evaluarPaciente(p1);
        evaluarPaciente(p2);
        evaluarPaciente(p3);
    }

    public static void evaluarPaciente(Paciente p) {
        System.out.println("\nInformación del paciente:");
        System.out.println(p.mostrarInfoPaciente());

        int imc = p.calcularIMC();
        if (imc == -1) {
            System.out.println("Está por debajo de su peso ideal.");
        } else if (imc == 0) {
            System.out.println("Está en su peso ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }

        System.out.println(p.esMayorDeEdad() ? "Es mayor de edad." : "No es mayor de edad.");
    }
}

