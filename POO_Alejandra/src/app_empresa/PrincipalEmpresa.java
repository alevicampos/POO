package app_empresa;

public class PrincipalEmpresa {
    public static void main(String[] args) {

        Empleado jefe = new Empleado("Carlos", "Gerente");
        Empleado empleado1 = new Empleado("Laura", "Desarrolladora");
        Empleado empleado2 = new Empleado("Pedro", "Diseñador");

        // Asignar supervisor
        empleado1.asignarSupervisor(jefe);
        empleado2.asignarSupervisor(jefe);

        // Agregar compañeros de trabajo
        empleado1.agregarCompanero(empleado2);

        // Mostrar información
        jefe.mostrarInfo();
        empleado1.mostrarInfo();
        empleado2.mostrarInfo();
    }
}
