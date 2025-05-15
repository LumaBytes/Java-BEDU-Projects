import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class SimuladorFarmacia{
    public static void main (String [] args ){
        Scanner scanner = new Scanner(System.in);

        String nombreMedicamento;
        double precioUnitario;
        var piezas=0;

        System.out.println("Introduzca el nombre del medicamento");
        nombreMedicamento = scanner.nextLine();

        System.out.println("Ingrese el precio unitario del medicamento");
        precioUnitario = scanner.nextDouble();

        scanner.nextLine();

        //al ser var, java lo detecta como string y necesito convertirlo a int
        System.out.println("Ingrese la cantidad de piezas a comprar");
        piezas = Integer.parseInt(scanner.next());

        double totalsindescuento = precioUnitario * piezas;
        boolean aplicaDescuento = totalsindescuento>500;
        double descuento = aplicaDescuento ? totalsindescuento * .15 : 0;
        double totalFinal = totalsindescuento - descuento;




        System.out.println("\n\uD83D\uDCDD Detalles de compra \uD83D\uDCDD");
        System.out.println("\uD83E\uDDF4 Medicamento: " + nombreMedicamento);
        System.out.println("\uD83D\uDD17 Cantidad: " + piezas +" piezas");
        System.out.println("\uD83C\uDFF7\uFE0F Precio unitario: $"+ precioUnitario + " mxn");
        System.out.println("\uD83D\uDCC3 Total sin descuento: $"+ totalsindescuento + " mxn" );
        System.out.println("\n⛔¿Aplica descuento? " + aplicaDescuento);
        System.out.println("\uD83D\uDCB2 Descuento: " + descuento + " mxn");
        System.out.println("\uD83D\uDCB0 Total a pagar: $" + totalFinal + " mxn" );



}
}
