package app_bibilioteca;

public class Libro {
    private static int cantidadLibros = 0;
    private static int librosDisponibles= 0;
    public static final String ID_LIBROS = "LIB";

    private String titulo;
    private String autor;
    private String idLibro;
    private boolean estaDisponible;
    private Estudiante estudiantePrestado;
    private Libro libroPrestado;
    private Editorial editorial;

    //Constructor parametrizado con el título y el autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.idLibro = calcularId();
        this.estaDisponible = true;
        this.estudiantePrestado = null;
        this.editorial = editorial;
        cantidadLibros++;
        librosDisponibles++;
    }

    //Método para calcular el id
    private String calcularId(){
        return ID_LIBROS + String.format("%03d",cantidadLibros);
    }
//    // Método para prestar un libro
//    public void prestar(Estudiante estudiante){
//
//        if(estaDisponible && estudiante.getLibroPrestado() == null) {
//            estaDisponible = false;
//            System.out.println("El libro " + getTitulo() + " ha sido prestado con éxito " + " a " + estudiante.getNombre() + ".");
//            librosDisponibles--;
//            estudiantePrestado = estudiante;
//            estudiante.setLibroPrestado(this); // MODIFICAMOS EL OBJETO ORIGINAL QUE HA ENTRADO POR PARÁMETRO
//        } else if (estudiante.getLibroPrestado() != null) {
//            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene un libro prestado.");
//        }else{
//            System.out.println("El libro " + getTitulo() + " no se puede prestar (no disponible).");
//        }
//
//    }


    public void devolver(boolean estaDisponible){
        if(!estaDisponible) {
            estaDisponible = true;
            librosDisponibles++;
            System.out.println("El libro ha sido devuelto con exito");
        }else {
            System.out.println("El libro no se puede devolver");
        }
    }
    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getEstaDisponible() {
        return estaDisponible;
    }

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    //Método para verificar la disponibilidad
    public void estaDisponible(){
        if(getEstaDisponible()){
            System.out.println("El libro " + getTitulo()+ " está disponible.");
        }else{
            System.out.println("El libro " + getTitulo() + " no está disponible.");
        }
    }

    //Métodos estáticos
    public static int getTotalLibros() {
        return cantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }


    @Override
    public String toString() {
        if (estudiantePrestado != null) {
            estudiantePrestado.getNombre();
        }else{
            System.out.println("Ninguno");
        }
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", idLibro=" + idLibro +
                ", estaDisponible=" + estaDisponible +
                ", Estudante Prestado=" + estudiantePrestado +
                '}';
    }
}
