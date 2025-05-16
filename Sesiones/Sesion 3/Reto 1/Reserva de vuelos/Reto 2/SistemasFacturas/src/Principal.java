import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\uD83D\uDCC4 Sistema de creación de Facturas\n");

        // Primera factura (con RFC)
        System.out.println("\uD83D\uDCDD Ingrese los siguientes datos para crear su primera factura");
        System.out.print("Ingrese la descripción: ");
        String descripcion1 = scanner.nextLine();

        System.out.print("Ingrese el monto: $");
        double monto1 = Double.parseDouble(scanner.nextLine()); // Usamos esto en vez de nextDouble()

        System.out.print("Ingrese el RFC: ");
        String rfc1 = scanner.nextLine();

        Factura factura1 = new Factura(monto1, descripcion1, rfc1);

        // Segunda factura (sin RFC)
        System.out.println("\n\uD83D\uDCDD Ingrese los siguientes datos para crear su segunda factura");
        System.out.print("Ingrese la descripción: ");
        String descripcion2 = scanner.nextLine();

        System.out.print("Ingrese el monto: $");
        double monto2 = Double.parseDouble(scanner.nextLine()); // Usamos esto en vez de nextDouble()

        // Para la segunda factura, pasamos null como RFC (para demostrar Optional)
        Factura factura2 = new Factura(monto2, descripcion2, null);

        scanner.close(); // Cerramos el scanner

        // Mostrar resúmenes
        System.out.println("\n=== RESUMEN DE FACTURAS ===");
        System.out.println(factura1.getResumen());
        System.out.println();  // Línea en blanco para separar las facturas
        System.out.println(factura2.getResumen());

    }
}
