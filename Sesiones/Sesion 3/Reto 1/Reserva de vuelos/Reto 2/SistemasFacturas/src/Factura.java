import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional <String> rfc;

    public Factura(double monto, String descripcion, String rfc){
        this.monto=monto;
        this.descripcion=descripcion;
        if (rfc != null){ //como no se si pondra el rfc o no, pongo ambas opciones
            this.rfc=Optional.ofNullable(rfc);
        }else {
            this.rfc=Optional.empty();
        }
    }
    public String getResumen(){
        StringBuilder resumen = new StringBuilder();
        resumen.append("📄 Factura generada:\n");
        resumen.append("Descripción: ").append(descripcion).append("\n");
        resumen.append("Monto: $").append(monto).append("\n");

        resumen.append("RFC: ").append(rfc.orElse("[No proporcionado]"));
        return resumen.toString();
    }
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Optional<String> getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = Optional.ofNullable(rfc);
    }
}