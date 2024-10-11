public class Seguro {
    private int idSeguro;
    private boolean tipo; // true = completo, false = básico
    private double precio;

    public Seguro() {}

    public Seguro(int idSeguro, boolean tipo, double precio) {
        this.idSeguro = idSeguro;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Seguro{" +
                "idSeguro=" + idSeguro +
                ", tipo=" + (tipo ? "COMPLETO" : "BÁSICO") +
                ", precio=" + precio +
                '}';
    }
}
