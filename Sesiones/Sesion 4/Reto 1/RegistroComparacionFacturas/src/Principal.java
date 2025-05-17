public class Principal {
    public static void main (String [] args){
        Factura factura1 = new Factura("XHMZT1","Sotomayor Francisco",14569.78);
        Factura factura2 = new Factura("XHMZT1","Miel y derivados OSAKO",1783.9);

        System.out.println(factura1);
        System.out.println(factura2);

        System.out.println("\n\uD83D\uDCB0¿Las facturas son iguales?: "+ factura1.equals(factura2));

    }

}
