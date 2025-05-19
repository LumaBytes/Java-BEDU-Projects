package reto1;

public class PaqueteNarrativo {
    private String escenaActual;

    public PaqueteNarrativo(String escenaActual) {
        this.escenaActual = escenaActual;
    }

    public String getEscenaActual() {
        return escenaActual;
    }

    public void setEscenaActual(String nuevaEscena) {
        this.escenaActual = nuevaEscena;
    }
}
