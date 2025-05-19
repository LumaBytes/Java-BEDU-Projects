package Reto2;

public class PagoEfectivo extends MetodoPago implements Autenticable {

   public PagoEfectivo(double monto){
       super (monto);
   }

    @Override
   public boolean autenticar(){
        System.out.println("No es necesaria la validacion para pago en efectivo");
        return true;
    }


    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo por $ " + monto);
    }
}
