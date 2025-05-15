import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\uD83D\uDDD3\uFE0F Ingresa el nombre del evento");
        String nombreEvento = scanner.nextLine();

        System.out.println("\uD83D\uDCB0 Ingresa el precio de la entrada");
        double precioEntrada = scanner.nextDouble();

        Entrada entrada1 = new Entrada (nombreEvento,precioEntrada);
        System.out.println("\uD83C\uDF89 Evento registrado \uD83C\uDF89 \n");

        scanner.nextLine();

        System.out.println("\uD83D\uDDD3\uFE0F Ingresa el nombre del evento");
        String nombre2 = scanner.nextLine();

        System.out.println("\uD83D\uDCB0 Ingresa el precio de la entrada");
        double precio2= scanner.nextDouble();

        Entrada entrada2 = new Entrada (nombre2,precio2);
        System.out.println(" \uD83C\uDF89 Evento registrado \uD83C\uDF89 \n");

        System.out.println("\uD83D\uDCCB Eventos disponibles");
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

    }
}