package reto1;

public class Patrulla extends UnidadEmergencia{

    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Patrulla (String nombre, String nombreOperador){
        super(nombre);
        this.gps= new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder(){
        System.out.println("\uD83D\uDE93 Patrulla atendiendo situación de seguridad ciudadana ");
    }
}
