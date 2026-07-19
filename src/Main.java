import Clases.Empleado;
import java.util.Scanner;

 void main(String[] args) {

    try {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        String NombreEmpleado = scanner.nextLine();

        System.out.println("Ingrese el salario del empleado: ");
        double SalarioEmpleado = scanner.nextDouble();

        if(SalarioEmpleado < 0.0)
        {
            System.out.println("El salario no puede ser negativo.\n\t  ¡Intente de nuevo!");
        }
        else {
        Empleado nuevoEmp = new Empleado(NombreEmpleado,SalarioEmpleado);
        System.out.println("Nuevo usuario registrado:\n " + "Nombre: " + nuevoEmp.getNombre() + " Salario: " + nuevoEmp.getSalario());
        }

    } catch (Exception e) {
        System.out.println("Error: " + e);
    }
}
