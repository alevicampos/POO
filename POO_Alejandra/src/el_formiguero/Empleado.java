package el_formiguero;

public class Empleado {

    private static int contador = 1;//para ir aumentado el valor del id
    //constante prefijo para calcular el id
    private static final String FORMAT_ID = "EP";
    //vector para guardar los cargos válidos
    private static final String[] CARGOS_VALIDOS = {"director", "técnico", "presentador", "colaborador"};
    //Atributos
    private String idEmpleado;
    private String nombre;
    private String cargo;
    private Empleado director;

    //Constructor
    public Empleado(String nombre, String cargo, Empleado director) {
        this.nombre = nombre;
        this.idEmpleado = calcularId();

        //Cualquiera que no sea uno de los valores permitidos,
        // no se debe permitir añadirlo como cargo y lo dejaremos por defecto “pte”.
        if (esCargoValido(cargo)) {
            this.cargo = cargo;
        } else {
            this.cargo = "pte";
        }

        // director (Empleado) – debe coincidir con el director del Programa.
        // Si el cargo ya es “director”, este atributo debe ser nulo.
        if (cargo.equals("director")) {
            this.director = null;
        } else {
            this.director = director;
        }
    }

    //Metodo para calcular el id
    private String calcularId() {
        return FORMAT_ID + String.format("%03d", contador++);
    }

    //metodo para comprobar si el cargo es válido
    private boolean esCargoValido(String cargo) {
        //recorro el vector que he creado antes para ver
        // si el cargo introducido se encuentra entre los posibles cargos
        for (String cargoIntroducido : CARGOS_VALIDOS) {
            if (cargoIntroducido.equalsIgnoreCase(cargo)) {
                return true;
            }
        }
        return false;
    }

    //getters y setters
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado='" + idEmpleado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director.getNombre() +
                '}';
    }
}


