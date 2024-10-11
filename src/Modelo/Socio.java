package Modelo;

public abstract class Socio {
    private String noSocio;
    private String nombre;
    private TipoSocio tipoSocio;
    public String getNoSocio() {
        return noSocio;
    }
    public String getNombre() {
        return nombre;
    }
    public TipoSocio getTipoSocio(){
        return tipoSocio;
    }

    public void setNoSocio(String noSocio) {
        this.noSocio = noSocio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoSocio(TipoSocio tipoSocio) {
        this.tipoSocio = tipoSocio;
    }

    public Socio() {}

    public Socio(String noSocio, String nombre, TipoSocio tipoSocio) {
        this.noSocio = noSocio;
        this.nombre = nombre;
        this.tipoSocio = tipoSocio;
    }

    public double calcularCuota(){}
    public double costeExcursion(Excursion excursion){}
}
