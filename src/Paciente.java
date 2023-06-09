public class Paciente {
    private String nombres;
    private String cedula;
    private String doctor;

    public Paciente(String nombres, String cedula, String doctor) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.doctor= doctor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return  "\n PACIENTE ENCONTRADO:" +
                "\nNombres='" + nombres + '\'' +
                "\n Cedula='" + cedula + '\'' +
                "\n Doctor='" + doctor + '\'' +
                "\n GRACIAS POR PREFERIRNOS";

    }
}
