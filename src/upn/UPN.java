package upn;

public class UPN {

    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        
        //nombre de los estudiantes
        System.out.println("----------------------------------------------------------");
        gestion.agregarEstudiante(new Estudiante("Paola", 12));
        gestion.agregarEstudiante(new Estudiante("Jefferson", 18));
        gestion.agregarEstudiante(new Estudiante("Andy", 10));
        gestion.agregarEstudiante(new Estudiante("Sebastian", 17));
        gestion.agregarEstudiante(new Estudiante("Renzo", 14));
        
        //queremos el promedio del aula, mejor estudiante y lista de estudiantes:
        System.out.println("Promedio del aula es: " + gestion.calcularPromedio());
        System.out.println("Mejor estudiante es: " + gestion.mejorEstudiante());
        System.out.println("----------------------------------------------------------");
        System.out.println("LISTA DE ESTUDIANTES ");
        gestion.mostrarEstudiantes();
    }
    
}
