package app_televisor;

public class Televisor {
    private int canal;
    private int volumen;

    // constructor por defecto, inicia en el canal 1 y volumen 5
    public Televisor() {
        this.canal = 1;
        this.volumen = 5;
    }
    // Constructor con parámetro para el canal
    public Televisor(int valorCanal) {
        if (valorCanal >= 1 && valorCanal <= 99) {
            this.canal = valorCanal;
        } else {
            this.canal = 1; // Valor por defecto si está fuera del rango
        }
        this.volumen = 5;
    }


    public int getCanal() {
        return canal;
    }

    // Método para establecer un canal específico
    public void setCanal(int valorCanal) {
        if (valorCanal >= 1 && valorCanal <= 99) {
            this.canal = valorCanal;
            System.out.println("Canal: " + canal);
        }
    }

    public int getVolumen() {
        return volumen;
    }

    // Método para establecer un volumen específico
    public void setVolumen(int valorVolumen) {
        if (valorVolumen >= 0 && valorVolumen <= 100) {
            this.volumen = valorVolumen;
            System.out.println("Volumen: " + volumen);
        }
    }

    public void subirCanal(){
        if (canal <99) {
            canal++;
            System.out.println("canal = " + canal);
        }
    }
    public void bajarCanal(){
        if (canal >1) {
            canal--;
            System.out.println("canal = " + canal);
        }
    }
    // Método para subir el volumen
    public void subirVolumen() {
        if (volumen < 100) {
            volumen++;
            System.out.println("Volumen: " + volumen);
        }
    }

    // Método para bajar el volumen
    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
            System.out.println("Volumen: " + volumen);
        }
    }
}