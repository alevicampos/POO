package org.example;

public class Televisor {
    // Atributos para el canal y el volumen
    private int canal;
    private int volumen;

    // Constructor por defecto: canal en 1 y volumen en 5
    public Televisor() {
        this.canal = 1;
        this.volumen = 5;
    }

    // Constructor con parámetros para canal y volumen iniciales
    public Televisor(int canalInicial, int volumenInicial) {
        if (canalInicial >= 1 && canalInicial <= 99) {
            this.canal = canalInicial;
        } else {
            this.canal = 1;
        }

        if (volumenInicial >= 0 && volumenInicial <= 100) {
            this.volumen = volumenInicial;
        } else {
            this.volumen = 5;
        }
    }

    // Métodos para subir y bajar el canal
    public void subirCanal() {
        if (canal < 99) {
            canal++;
            System.out.println("Canal: " + canal);
        }
    }

    public void bajarCanal() {
        if (canal > 1) {
            canal--;
            System.out.println("Canal: " + canal);
        }
    }

    // Métodos para subir y bajar el volumen
    public void subirVolumen() {
        if (volumen < 100) {
            volumen++;
            System.out.println("Volumen: " + volumen);
        }
    }

    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
            System.out.println("Volumen: " + volumen);
        }
    }

    // Getters y setters para canal
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 99) {
            this.canal = canal;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("Canal inválido. Debe estar entre 1 y 99.");
        }
    }

    // Getters y setters para volumen
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 100) {
            this.volumen = volumen;
            System.out.println("Volumen: " + volumen);
        } else {
            System.out.println("Volumen inválido. Debe estar entre 0 y 100.");
        }
    }
}

