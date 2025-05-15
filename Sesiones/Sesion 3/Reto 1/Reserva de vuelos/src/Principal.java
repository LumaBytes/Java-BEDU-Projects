import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de reservacion de vuelos");
        System.out.println("Para hacer una reservacion por favor ingrese sus datos");

        System.out.println("Nombre Completo");
        String nombre = scanner.nextLine();
        System.out.println("Clave de pasaporte");
        String pasaporte = scanner.nextLine();

        System.out.println("Ingrese el codigo del vuelo que quiere reservar");
        String codigoVuelo = scanner.nextLine();

        System.out.println("Destino a donde quiere viajar: ");
        String destino =scanner.nextLine();

        System.out.println("Horario en que quiere partir");
        String horaSalida = scanner.nextLine();

        Pasajero p1 = new Pasajero(nombre,pasaporte);
        Vuelo vuelo1 = new Vuelo (codigoVuelo, destino, horaSalida);

        vuelo1.reservarAsiento(p1);

        System.out.println(vuelo1.obtenerItinerario());;

        vuelo1.cancelarReserva(p1);

        System.out.println(vuelo1.obtenerItinerario());

        vuelo1.reservarAsiento(p1);

        System.out.println(vuelo1.obtenerItinerario());


    }
}