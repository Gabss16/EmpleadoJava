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
        } else {
            this.salario = 0;
            System.out.println("El salario no puede ser negativo.");
        }

    }
}
