package Reto2;

public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(372.0),
                new PagoTarjeta(892.0, 1000.0),
                new PagoTransferencia(912.0, false)
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}
