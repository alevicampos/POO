package app_televisor;


public class ClasePrincipal {
    public static void main(String[] args) {
        // Crear instancias de app_televisor.Televisor
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor(10);

        // Comprobar el estado inicial
        System.out.println("Estado inicial TV1 -> Canal: " + tv1.getCanal() + ", Volumen: " + tv1.getVolumen());
        System.out.println("Estado inicial TV2 -> Canal: " + tv2.getCanal() + ", Volumen: " + tv2.getVolumen());

        // Cambiar canal y volumen en TV1
        tv1.subirCanal();
        tv1.subirVolumen();
        tv1.bajarVolumen();

        // Cambiar canal y volumen en TV2
        tv2.setCanal(50);
        tv2.setVolumen(30);
        tv2.bajarCanal();
        tv2.subirVolumen();

        // Mostrar estado final
        System.out.println("Estado final TV1 -> Canal: " + tv1.getCanal() + ", Volumen: " + tv1.getVolumen());
        System.out.println("Estado final TV2 -> Canal: " + tv2.getCanal() + ", Volumen: " + tv2.getVolumen());

    }
}