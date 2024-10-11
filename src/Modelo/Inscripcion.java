package Modelo;
public class Inscripcion {
    private String idInscripcion;
    private Socio socio;
    private Excursion excursion;

    public Inscripcion() {}

    public Inscripcion(String idInscripcion, Socio socio, Excursion excursion) {
        this.idInscripcion = idInscripcion;
        this.socio = socio;
        this.excursion = excursion;
    }

    public String getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(String idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public boolean cancelarInscripcion() {
        // Implementar lógica para cancelar la inscripción
        return false;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "idInscripcion='" + idInscripcion + '\'' +
                ", socio=" + socio +
                ", excursion=" + excursion +
                '}';
    }
}
