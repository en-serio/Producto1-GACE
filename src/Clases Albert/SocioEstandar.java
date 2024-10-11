public class SocioEstandar extends Socio {
    private String nif;
    private Seguro seguro;

    public SocioEstandar() {}

    public SocioEstandar(String noSocio, String nombre, TipoSocio tipoSocio, String nif, Seguro seguro) {
        super(noSocio, nombre, tipoSocio);
        this.nif = nif;
        this.seguro = seguro;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
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
