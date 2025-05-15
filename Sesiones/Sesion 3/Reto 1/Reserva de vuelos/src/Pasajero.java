public class Pasajero {
    private String nombre;
    private String pasaporte;


    public Pasajero(String nombre, String pasaporte){
        this.nombre=nombre;
        this.pasaporte=pasaporte;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getPasaporte(){
        return this.pasaporte;
    }


}
