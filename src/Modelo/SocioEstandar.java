package Modelo;

public class SocioEstandar {
    private String nif;
    private Seguro seguro;

    public SocioEstandar() {}

    public SocioEstandar(String nif, Seguro seguro) {
        this.nif = nif;
        this.seguro = seguro;
    }

    public String getNif() {
        return nif;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "SocioEstandar{" +
                "nif='" + nif + '\'' +
                ", seguro=" + seguro +
                '}';
    }
}
