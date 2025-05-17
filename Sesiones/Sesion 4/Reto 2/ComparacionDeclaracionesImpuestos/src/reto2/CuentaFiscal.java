package reto2;

import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible){
        this.rfc = rfc;
        if (saldoDisponible >= 0){
            this.saldoDisponible = saldoDisponible;
        }else {
            System.out.println("⛔ Error. El saldo disponible no puede ser negativo, por tanto saldo disponible= 0 ");
            this.saldoDisponible = 0;
        }
    }

    public double getSaldoDisponible(){
        return saldoDisponible;
    }

    public String getRfc(){
        return rfc;
    }

    public boolean validaRfc(DeclaracionImpuestos di){
        return Objects.equals(this.rfc,di.rfcContribuyente());
    }
    public void mostrarCuenta(){
        System.out.println("\uD83C\uDFE6 Cuenta fiscal registrada con RFC: "+rfc + ", saldo disponible: $"+saldoDisponible);
    }
}
