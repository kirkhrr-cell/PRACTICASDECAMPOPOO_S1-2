public class Calcuadora
{
    public String Historial;
    public static int TotalOperaciones = 0;

    public Calcuadora()
    {
        Historial = "";
    }

    public int Sumar(int a, int b)
    {
        TotalOperaciones++;
        int resultado = a + b;
        TotalOperaciones++;
        Historial += a + "=" + resultado + "\n";
        return resultado;
    }

    public double sumar(int a, int b)
    {
        double resultado = a + b;
        TotalOperaciones++;
        Historial += a + "+" + b + "=" + resultado + "\n";
        return resultado;
    }

    public int sumar(int a, int b, int c)
    {
        return (a + b) + c;
    }

    public static int totalOperaciones()
    {
        return TotalOperaciones;
    }

    public void mostrarHistorial()
    {
        System.out.println(Historial);
    }

}