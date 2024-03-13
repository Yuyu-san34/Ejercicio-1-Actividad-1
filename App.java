import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese código del empleado: ");
        int codigoEmpleado = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese nombres del empleado: ");
        String nombresEmpleado = scanner.nextLine();
        System.out.print("Ingrese número de horas trabajadas al mes: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese valor de la hora trabajada: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Ingres porcentaje de retención en la fuente (%): ");
        double porcentajeRetencion = scanner.nextDouble();
        double salarioBruto = horasTrabajadas * valorHora;
        double retencion = salarioBruto * (porcentajeRetencion / 100);
        double salarioNeto = salarioBruto - retencion;
        System.out.println("\nInformación del empleado:");
        System.out.println("Código del empleado: " + codigoEmpleado);
        System.out.println("Nombres del empleado: " + nombresEmpleado);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Salario neto: $" + salarioNeto);
        scanner.close();


