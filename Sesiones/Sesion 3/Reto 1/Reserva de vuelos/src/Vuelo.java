import java.util.Scanner;

public class Vuelo {
     final String codigoVuelo;
     String destino;
     String horaSalida;
     Pasajero asientoReservado= null;
     Scanner scanner = new Scanner(System.in);

     public Vuelo(String codigoVuelo,String destino, String horaSalida){
         this.codigoVuelo=codigoVuelo;
         this.destino=destino;
         this.horaSalida=horaSalida;
     }

     boolean reservarAsiento(Pasajero p1){
         if (asientoReservado == null){
             asientoReservado=p1;
             System.out.println("\n✅Se registro con exito su reservacion Sr(a)" + p1.getNombre()+"\n");
             return true;
         }else{
             System.out.println("\uD83D\uDFE1El vuelo que desea reservar esta ocupado, por favor seleccione otro vuelo\n");
             return false;
         }
     }

     boolean reservarAsiento(String nombre, String pasaporte) {
         Pasajero p1 = new Pasajero(nombre,pasaporte);
         return reservarAsiento(p1);
     }

     void cancelarReserva(Pasajero p1){
         if (asientoReservado != null){
             System.out.println("\n❌ Cancelando reservacion de "+ asientoReservado.getNombre() + " ....\n");
             asientoReservado = null;
             System.out.println("✅Reserva cancelada\n");
         } else {
             System.out.println(" ⚠\uFE0FNo hay ningun asiento reservado ⚠\uFE0F\n");
         }
     }

     String obtenerItinerario(){
         return "\n✈️ Itinerario del vuelo:\n"
                 + "\uD83C\uDF10Código: " + codigoVuelo + "\n"
                 + "\uD83E\uDDF3Destino: " + destino + "\n"
                 + "\uD83D\uDCC5Salida: " + horaSalida + " horas\n"
                 + ((asientoReservado != null)
                 ? "☑\uFE0FPasajero: " + asientoReservado.getNombre()
                 : "\uD83D\uDD35Asiento sin reservar\n");
     }


}
