public class Paciente {
    // Atributos del paciente
    private String nombre;
    private int edad;
    private String idExpediente;

    // Constructor
    public Paciente(String nombrePaciente, int edadPaciente, String expedientePaciente) {
        this.nombre = nombrePaciente;
        this.edad = edadPaciente;
        this.idExpediente = expedientePaciente;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getIdExpediente() {
        return idExpediente;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + idExpediente);
    }
}

