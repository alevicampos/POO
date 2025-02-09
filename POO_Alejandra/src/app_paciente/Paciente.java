package app_paciente;

import java.util.Random;

public class Paciente {
    // Constantes
    private static final char SEXO_POR_DEFECTO = 'X';
    private static final int BAJO_PESO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;

    // Atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    // Tabla de letras del DNI
    private static final char[] LETRAS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    // Constructor por defecto
    public Paciente() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    // Constructor con todos los parámetros
    public Paciente(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = (nombre != null) ? nombre : "";
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    // Constructor con nombre, edad y sexo
    public Paciente(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0.0, 0.0);
    }

    // Método para generar un DNI aleatorio
    private String generarDNI() {
        Random random = new Random();
        int numero = random.nextInt(90000000) + 10000000;
        char letra = LETRAS_DNI[numero % 23];
        return numero + String.valueOf(letra);
    }

    // Método para calcular el IMC
    public int calcularIMC() {
        if (altura == 0) return PESO_IDEAL; // Evitar división por cero
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) return BAJO_PESO;
        if (imc <= 25) return PESO_IDEAL;
        return SOBREPESO;
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método privado para comprobar el sexo
    private char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : SEXO_POR_DEFECTO;
    }

    // Método para mostrar la información del paciente
    public String mostrarInfoPaciente() {
        return toString();
    }

    // Getters y Setters (excepto DNI)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

