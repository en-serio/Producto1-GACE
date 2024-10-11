import java.util.ArrayList;
import java.util.Date;

public class ListaInscripcion {
    private ArrayList<Inscripcion> listaInsc;

    public ListaInscripcion() {
        this.listaInsc = new ArrayList<>();
    }

    public void anyadirInscripcion(Inscripcion inscripcion) {
        listaInsc.add(inscripcion);
    }

    public Inscripcion getInscripcion(String idInscripcion) {
        for (Inscripcion inscripcion : listaInsc) {
            if (inscripcion.getIdInscripcion().equals(idInscripcion)) {
                return inscripcion;
            }
        }
        return null; // o lanzar excepción
    }

    public void eliminarInscripcion(Inscripcion inscripcion) {
        listaInsc.remove(inscripcion);
    }

    public ArrayList<Inscripcion> filtraSocio(Socio socio) {
        ArrayList<Inscripcion> resultado = new ArrayList<>();
        for (Inscripcion inscripcion : listaInsc) {
            if (inscripcion.getSocio().equals(socio)) {
                resultado.add(inscripcion);
            }
        }
        return resultado;
    }

    public ArrayList<Inscripcion> filtrarFecha(Date fecha) {
        ArrayList<Inscripcion> resultado = new ArrayList<>();
        for (Inscripcion inscripcion : listaInsc) {
            if (inscripcion.getFecha().equals(fecha)) {
                resultado.add(inscripcion);
            }
        }
        return resultado;
    }

    public ArrayList<Inscripcion> getListaInsc() { // Método para obtener la lista de inscripciones
        return listaInsc;
    }
}
