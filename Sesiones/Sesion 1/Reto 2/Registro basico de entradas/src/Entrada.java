public record Entrada (String nombreEvento, double precioEntrada){

     public void mostrarInformacion(){
         System.out.println("\uD83C\uDF9F\uFE0F Evento: " + nombreEvento + "   |  " + "Precio: $" + precioEntrada);
    }
        }