package upn;

public class Estudiante {
    String nombre;
    double calificacion;

    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", calificacion=" + calificacion;
    }
    
    
}
