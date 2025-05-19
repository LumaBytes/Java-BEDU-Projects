package reto1;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué deseas hacer?");
        System.out.println("A: Tomar la pastilla roja");
        System.out.println("B: Tomar la pastilla azul");
        System.out.print("Selecciona A o B: ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }
}
