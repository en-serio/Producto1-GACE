public class ExcursionControlador {
    private ListaExcursion listaExcursiones;
    private VistaExcursion vistaExcursion;

    public ExcursionControlador(ListaExcursion listaExcursiones, VistaExcursion vistaExcursion) {
        this.listaExcursiones = listaExcursiones;
        this.vistaExcursion = vistaExcursion;
    }

    public void gestionarExcursion() {
        // Implementar la lógica para gestionar excursiones
    }

    public void crearExcursion() {
        Excursion excursion = vistaExcursion.formExcursion();
        if (excursion != null) {
            listaExcursiones.anyadirExcursion(excursion);
        }
    }

    public void eliminarExcursion(String codigo) {
        Excursion excursion = listaExcursiones.getExcursion(codigo);
        if (excursion != null) {
            listaExcursiones.eliminarExcursion(excursion);
        } else {
            System.out.println("Excursión no encontrada.");
        }
    }

    public void mostrarDetalleExcursion(String codigo) {
        Excursion excursion = listaExcursiones.getExcursion(codigo);
        if (excursion != null) {
            vistaExcursion.detalleExcursion(excursion);
        } else {
            System.out.println("Excursión no encontrada.");
        }
    }
}
