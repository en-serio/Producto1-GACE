package Modelo;
import java.util.Date;

public class Excursion {
    private String codigo;
    private String descripcion;
    private Date fecha;
    private int noDias;
    private double precio;

    public Excursion() {}

    public Excursion(String codigo, String descripcion, Date fecha, int noDias, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.noDias = noDias;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNoDias() {
        return noDias;
    }

    public void setNoDias(int noDias) {
        this.noDias = noDias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcPrecio(Socio socio) {
        // Implementar lógica para calcular el precio según el tipo de socio
        return 0.0;
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", noDias=" + noDias +
                ", precio=" + precio +
                '}';
    }
}
