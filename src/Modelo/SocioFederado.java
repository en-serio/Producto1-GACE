package Modelo;
public class SocioFederado extends Socio {
    private String nif;
    private Federacion federacion;

    public SocioFederado() {}

    public SocioFederado(String noSocio, String nombre, TipoSocio tipoSocio, String nif, Federacion federacion) {
        super(noSocio, nombre, tipoSocio);
        this.nif = nif;
        this.federacion = federacion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Federacion getFederacion() {
        return federacion;
    }

    public void setFederacion(Federacion federacion) {
        this.federacion = federacion;
    }

    @Override
    public double calcularCuota() {
        // Implementar lógica de cálculo de cuota
        return 0.0;
    }

    @Override
    public double costeExcursion(Excursion excursion) {
        // Implementar lógica de cálculo del coste de excursión
        return 0.0;
    }
}
