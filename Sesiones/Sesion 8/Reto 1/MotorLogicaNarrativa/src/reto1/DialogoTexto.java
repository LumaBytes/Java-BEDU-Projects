package reto1;

public class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo(PaqueteNarrativo paquete) {
        System.out.println("Escena actual: " + paquete.getEscenaActual());
        System.out.println("Morfeo aparecere frente a Neo y le ofrece los opciones.\nToma la pastilla azul y la historia termina, te despiertas en tu cama y crees lo que quieras creer. \nToma la pastilla roja y te quedas en el pais de las maravillas y te muestro lo profundo que es la madriguera del conejo...");
    }
}
