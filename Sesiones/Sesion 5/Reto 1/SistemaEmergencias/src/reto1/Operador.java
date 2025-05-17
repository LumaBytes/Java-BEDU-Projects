package reto1;

public class Operador {
    String nombre;

    public Operador(String nombre){
        this.nombre = nombre;
    }

    public void reportarse (){
        System.out.println("\uD83D\uDC6E Operador"+nombre+" reportandose.");
    }
}
