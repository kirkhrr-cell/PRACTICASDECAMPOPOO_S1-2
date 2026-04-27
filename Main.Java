public class Main 
{
    public static void main(String[] args) 
    {
        // Crear objetos de la clase Estudiante
        Estudiante e1 = new Estudiante(1001, "Juan Pérez", 16.5);
        Estudiante e2 = new Estudiante(1002, "María Gómez", 15.0);
        Estudiante e3 = new Estudiante(1003, "Carlos López", 17.0);

        // Mostrar información de los estudiantes
        e1.mostrarInformacion();
        e2.mostrarInformacion();
        e3.mostrarInformacion();
        
        System.out.println("Total de estudiantes: " + Estudiante.getTotalEstudiantes());

}