public class Estudiante 
{
     // Atributos de instancia (privados - encapsulamiento)
    private int codigo;
    private String nombre;
    private double nota;

    //variable estatica (compartida por todas las instancias de la clase)
    private static int totalEstudiantes = 0;
  
    // Constructor

    public Estudiante() 
    {
        // Constructor vacío
    }

    public Estudiante(int _codigo, String _nombre, double _nota) 
    {
        setCodigo(_codigo);
        setNombre(_nombre);
        setNota(_nota);
        totalEstudiantes++; // Incrementar el contador de estudiantes cada vez que se crea uno nuevo    
    }

    //getter y setter para el código (ejemplo de encapsulamiento)
    public int getCodigo() 
    { 
        return codigo; 
    }

    public void setCodigo(int codigo) 
    { 
        this.codigo = codigo; 
    }

    public String getNombre() 
    { 
        return nombre; 
    }

    public void setNombre(String nombre) 
    { 
        this.nombre = nombre; 
    }

    public double getNota()   
    { 
        return nota; 
    }

    public void setNota(double nota) 
    { 
        this.nota = nota; 
    }

    public static int getTotalEstudiantes() 
    { 
        return totalEstudiantes; 
    }

    //metodos

    public void mostrarInformacion() 
    {
        System.out.println("Estudiante: " + nombre + " | Nota: " + nota);  
    }
}
