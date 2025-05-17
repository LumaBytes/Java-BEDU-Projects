public class Factura {
    private String folio;
    private String cliente;
    private double total;


    public Factura(String folio, String cliente, double total){
        this.folio=folio;
        this.cliente=cliente;
        this.total=total;
    }
    @Override
    public String toString(){
        return "\uD83D\uDCD1Factura [folio="+ folio +", cliente= "+ cliente +", total=$"+total +"]";
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio);
    }
    @Override
    public int hashCode(){
        return folio.hashCode();
    }
}
