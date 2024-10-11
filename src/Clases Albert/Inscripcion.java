import java.util.Date;

public class Inscripcion {
    private String idInscripcion;
    private Socio socio;
    private Excursion excursion;
    private Date fecha; // Campo para almacenar la fecha de la inscripción

    public Inscripcion(String idInscripcion, Socio socio, Excursion excursion, Date fecha) {
        this.idInscripcion = idInscripcion;
        this.socio = socio;
        this.excursion = excursion;
        this.fecha = fecha; // Inicializamos el campo de fecha
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

    public Date getFecha() { // Método para obtener la fecha
        return fecha;
    }

    public void setFecha(Date fecha) { // Método para establecer la fecha
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "idInscripcion='" + idInscripcion + '\'' +
                ", socio=" + socio +
                ", excursion=" + excursion +
                ", fecha=" + fecha +
                '}';
    }
}
