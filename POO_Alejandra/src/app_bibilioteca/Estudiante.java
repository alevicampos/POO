package app_bibilioteca;

public class Estudiante {
    public static int contadorEstudiantes = 0;
    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int nia;
    private String email;

    // Constructor con todos los atributos menos el NIA
    public Estudiante(String nombre, String curso, String email) {

        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        contadorEstudiantes++;
        nia = contadorEstudiantes;
    }
    // Constructor solo con el nombre
    public Estudiante(String nombre) {

        this.nombre = nombre;
        contadorEstudiantes++;
        nia = contadorEstudiantes;

    }
    //Método estático para obtener el total de estudiantes
    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }
    //Método estatico para validar el formato del correo electrónico
    public static boolean validarEmail(String email){
        return email.matches(CORREO_FORMAT);
    }

    public static void setContadorEstudiantes(int contadorEstudiantes) {
        Estudiante.contadorEstudiantes = contadorEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    //Método toString parra mostrar información del estudiante
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", nia=" + nia +
                ", email='" + email + '\'' +
                '}';
    }
}
