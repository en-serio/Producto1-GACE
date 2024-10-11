public class InscripcionControlador {
    private ListaInscripcion listaInscr;
    private VistaInscripciones vistaInscr;

    public InscripcionControlador(ListaInscripcion listaInscr, VistaInscripciones vistaInscr) {
        this.listaInscr = listaInscr;
        this.vistaInscr = vistaInscr;
    }

    public void gestionarInscr() {
        // Implementar la lógica para gestionar inscripciones
    }

    public void crearInsc(ListaSocios listaSocios, ListaExcursion listaExcursiones) {
        Inscripcion inscripcion = vistaInscr.formInscripcion(listaSocios, listaExcursiones);
        if (inscripcion != null) {
            listaInscr.anyadirInscripcion(inscripcion);
        }
    }

    public void eliminarInscr(String idInscr) {
        Inscripcion inscripcion = listaInscr.getInscripcion(idInscr);
        if (inscripcion != null) {
            listaInscr.eliminarInscripcion(inscripcion);
        } else {
            System.out.println("Inscripción no encontrada.");
        }
    }

    public void mostrarDetalleInscr(String idInscr) {
        Inscripcion inscripcion = listaInscr.getInscripcion(idInscr);
        if (inscripcion != null) {
            vistaInscr.mostrarInscripciones(listaInscr); // Utilizar el nuevo método para mostrar detalles
        } else {
            System.out.println("Inscripción no encontrada.");
        }
    }
}
