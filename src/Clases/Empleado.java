package Clases;

public class Empleado {

    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.salario = 0;
    }
    public void setSalario(double salario) {

        if (salario >= 0) {
            this.salario = salario;
        }
        else {
            System.out.println("El salario no puede ser negativo.");
            this.salario = 0;
        }

    }

    public String getNombre() {return  nombre; }
    public double getSalario() {return  salario; }
}
