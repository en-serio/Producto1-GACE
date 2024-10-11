public abstract class Socio {
    private String noSocio;
    private String nombre;
    private TipoSocio tipoSocio;

    protected Socio() {}

    public Socio(String noSocio, String nombre, TipoSocio tipoSocio) {
        this.noSocio = noSocio;
        this.nombre = nombre;
        this.tipoSocio = tipoSocio;
    }

    public String getNoSocio() {
        return noSocio;
    }

    public void setNoSocio(String noSocio) {
        this.noSocio = noSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoSocio getTipoSocio() {
        return tipoSocio;
    }

    public void setTipoSocio(TipoSocio tipoSocio) {
        this.tipoSocio = tipoSocio;
    }

    public abstract double calcularCuota();

    public abstract double costeExcursion(Excursion excursion);

    @Override
    public String toString() {
        return "Socio{" +
                "noSocio='" + noSocio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipoSocio=" + tipoSocio +
                '}';
    }
}
