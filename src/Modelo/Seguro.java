package Modelo;

public class Seguro {
    // Variables de Clase
    private int idSeguro;
    private boolean tipo;
    private double precio;

    public Seguro() {
    }
    public Seguro(int idSeguro, boolean tipo, double precio) {
        this.idSeguro = idSeguro;
        this.tipo = tipo;
        this.precio = precio;
    }
    //Getter y Setter IdSeguro
    public int getIdSeguro() {
        return idSeguro;
    }
    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }
    //Getter y Setter Tipo
    public boolean getTipo() {
        return tipo;
    }
    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
    //Getter y Setter Precio
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //ToString
    public void mostrarInformacion() {
        System.out.println("ID Seguro: " + idSeguro);
        System.out.println("Tipo de Seguro: " + (tipo ? "Seguro Completo" : "Seguro Básico"));
        System.out.println("Precio del Seguro: " + precio);
    }
}
