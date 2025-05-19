package reto1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RegistroMuestras {
    public static void main(String[] args) {
        ArrayList<String> muestras = new ArrayList<>();

        muestras.add("Canis lupus");
        muestras.add("Pan troglodytes");
        muestras.add("Bos taurus");
        muestras.add("Apis mellifera");

        System.out.println("Muestras recibidas en orden:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        System.out.println("\nEspecies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        muestrasInvestigador.put("M-AA1", "Dr. Li Zhen");
        muestrasInvestigador.put("M-AA2", "Dra. Daniela Gutierrez");
        muestrasInvestigador.put("M-AA3", "Dr. Justin Porter");

        System.out.println("\nAsignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        String idBuscar = "M-002";
        System.out.println("\n Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}
