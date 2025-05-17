package reto2;

public class Main {
    public static void main (String [] args){

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("DJWEOTT018372121",9876.23);

        CuentaFiscal cuenta = new CuentaFiscal("DJWEOTT018372121",9876.23);

        System.out.println("\uD83D\uDCC4 Declaración enviada por RFC: "+ declaracion.rfcContribuyente() +", por el monto de: $"+ declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        boolean rfcValido = cuenta.validaRfc(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);



    }
}
