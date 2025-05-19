package Reto2;

public class PagoTransferencia extends MetodoPago implements Autenticable {
    private boolean validadoExternamente;

    public PagoTransferencia(double monto, boolean validadoExternamente){
        super (monto);
        this.validadoExternamente = validadoExternamente;
    }

    @Override
    public boolean autenticar(){
        return validadoExternamente;
    }

    @Override
    public void procesarPago(){
        System.out.println("Procesando transferencia por $" + monto);
    }
}
