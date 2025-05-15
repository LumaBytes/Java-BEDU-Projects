import java.util.Scanner;

public class CajeroAuntomatico {
    public static void main ( String [] arga ){
        Scanner scanner = new Scanner(System.in);
        var saldoInicial=0.0;
        int opcion;
        double retiro;
        double deposito;


        do {
            System.out.println("╔════════════════════════════════════════════════════╗");
            System.out.println("║       \uD83D\uDC4BBienvenido al cajero automatico\uD83D\uDC4B          ║");
            System.out.println("╠════════════════════════════════════════════════════╣");
            System.out.printf("║ %-50s ║\n", "1. Consultar saldo");
            System.out.printf("║ %-50s ║\n", "2. Depositar dinero");
            System.out.printf("║%-50s  ║\n", " 3. Retirar dinero");
            System.out.printf("║%-50s  ║\n", " 4. Salir");
            System.out.println("╚════════════════════════════════════════════════════╝");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\uD83D\uDCB0El saldo actual en la cuenta es: $" + saldoInicial +" mxn\uD83D\uDCB0\n");
                    break;
                case 2:
                    System.out.println("\uD83D\uDCC9Ingrese el monto que desea depositar: ");
                    deposito = scanner.nextDouble();
                    saldoInicial = saldoInicial + deposito;
                    System.out.println("\uD83D\uDFE2Transaccion exitosa\uD83D\uDFE2\n");
                    break;
                case 3:
                    System.out.println("\uD83D\uDCC8Ingrese el monto que desea retirar: ");
                    retiro = scanner.nextDouble();
                    if (saldoInicial > retiro) {
                    saldoInicial = saldoInicial - retiro;
                    System.out.println("\uD83D\uDFE2Transaccion exitosa\uD83D\uDFE2\n");
                    break;
                }else{
                    System.out.println("\uD83D\uDD34Error. Saldo insuficiente para efectuar operacion.\uD83D\uDD34\n");
                }
                break;
                case 4:
                    System.out.println("\uD83D\uDE4CGracias por utilizar nuestro servicio, excelente dia\uD83D\uDE4C\n");
                    break;
                default:
                    System.out.println("\uD83D\uDD34Error. Por favor seleccione una opcion valida\uD83D\uDD34 \n");
            }
        } while (opcion != 4);





        }






    }

