package reto1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {
    public static void main(String[] args) {

        Path rutaCarpeta = Paths.get("src/reto1/config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        String parametros = "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8\n";

        guardarParametros(rutaCarpeta, rutaArchivo, parametros);
        leerParametros(rutaArchivo);
    }

    public static void guardarParametros(Path rutaCarpeta, Path rutaArchivo, String parametros) {
        try {

            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectory(rutaCarpeta);
                System.out.println("Carpeta 'config' creada.");
            }

            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("Archivo de parámetros escrito correctamente.");

            if (Files.exists(rutaArchivo)) {
                System.out.println("El archivo fue creado exitosamente en: " + rutaArchivo.toAbsolutePath());

                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo:");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("El archivo no fue creado.");
            }

        } catch (IOException e) {
            System.out.println(" Error al trabajar con el archivo: " + e.getMessage());
        }
    }

    public static void leerParametros(Path rutaArchivo) {
        try {
            if (Files.exists(rutaArchivo)) {
                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo:");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer los parámetros: " + e.getMessage());
        }
    }

}
