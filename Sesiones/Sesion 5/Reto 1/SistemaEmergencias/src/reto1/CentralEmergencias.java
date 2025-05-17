package reto1;

public class CentralEmergencias {
    public static void main (String [] args){
        Ambulancia ambulancia = new Ambulancia("Ambulancia", " Michael Scott");
        Patrulla patrulla = new Patrulla("Patrulla", " Kim Namjoon");
        UnidadBomberos bomberos = new UnidadBomberos("Unidad de bomberos","  Jeon Jungkook");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();

    }
}
