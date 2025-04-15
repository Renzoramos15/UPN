
package upn;
import java.util.ArrayList;

public class GestionEstudiantes {
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
    public void agregarEstudiante (Estudiante estudiante){
       estudiantes.add(estudiante);
    }
    
    public double calcularPromedio(){
        if(estudiantes.isEmpty()){ //método que comprueba si una cadena, tabla u objeto está vacío
            return 0;
        }
        double suma = 0;
        
        for(Estudiante estudiante : estudiantes){
        suma += estudiante.calificacion;
        }
        return suma / estudiantes.size(); //size: "tamaño" en la funcion de la cantidad de elementos que hay
    }
    
    public Estudiante mejorEstudiante(){
        if (estudiantes.isEmpty()){
            return null;
        }
        Estudiante mejorEstudiante = estudiantes.get(0);
        
        for (Estudiante estudiante : estudiantes){
            if (estudiante.calificacion > mejorEstudiante.calificacion){
                mejorEstudiante = estudiante;
            }
        }
        return mejorEstudiante;
    }
    public void mostrarEstudiantes(){
        for (Estudiante estudiante : estudiantes){
            System.out.println(estudiante.toString());
        }
    }
}

