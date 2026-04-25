public class Estudiante 
{
     // Atributos de instancia (privados - encapsulamiento)
    private int codigo;
    private String nombre;
    private double nota;
 
    // Variable STATIC: compartida por todos los objetos
    private static int totalEstudiantes = 0;
 
    // Constructor
    public Estudiante() 
    {
        this.codigo = 0;
        this.nombre = "";
        this.nota = 0.0;
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
}
