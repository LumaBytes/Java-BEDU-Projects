package reto1;

public abstract class UnidadEmergencia {
    String nombre;
    public UnidadEmergencia(String nombre){
        this.nombre = nombre;
    }

    public void activarUnidad(){
        System.out.println("\uD83D\uDEA8 Activando unidad: "+ nombre);
    }
    public abstract void responder();
}
