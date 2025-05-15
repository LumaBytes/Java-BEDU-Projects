import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("",0,"");
        Scanner scanner = new Scanner(System.in);

        // Solicitud de datos al usuario
        System.out.println("Ingrese el nombre del paciente:");
        paciente.setNombre(scanner.nextLine());

        System.out.println("Ingrese la edad:");
        paciente.setEdad(scanner.nextInt());

        // Limpia el buffer
        scanner.nextLine();

        System.out.println("Ingrese el numero de expediente:");
        paciente.setIdExpediente(scanner.nextLine());

        // Cerrar el scanner
        scanner.close();

        // Mostrar información
        paciente.mostrarInformacion();
    }
}