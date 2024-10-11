import java.util.ArrayList;

public class VistaExcursion {
    public void mostrarExcursiones(ArrayList<Excursion> lista) {
        System.out.println("Lista de Excursiones:");
        for (Excursion excursion : lista) {
            System.out.println(excursion);
        }
    }

    public void detalleExcursion(Excursion excursion) {
        System.out.println("Detalles de la Excursión:");
        System.out.println("Código: " + excursion.getCodigo());
        System.out.println("Descripción: " + excursion.getDescripcion());
        System.out.println("Fecha: " + excursion.getFecha());
        System.out.println("Número de Días: " + excursion.getNoDias());
        System.out.println("Precio: " + excursion.getPrecio());
    }

    public Excursion formExcursion() {
        // Implementar la lógica para crear un formulario para una nueva excursión
        // Aquí puedes solicitar al usuario que ingrese los detalles de la excursión
        return new Excursion(); // Retornar una nueva instancia de Excursion por ahora
    }
}
