import java.util.ArrayList;
import java.util.Date;

public class ListaExcursion {
    private ArrayList<Excursion> listaExcursiones;

    public ListaExcursion() {
        this.listaExcursiones = new ArrayList<>();
    }

    public void anyadirExcursion(Excursion excursion) {
        listaExcursiones.add(excursion);
    }

    public Excursion getExcursion(String codigo) {
        for (Excursion excursion : listaExcursiones) {
            if (excursion.getCodigo().equals(codigo)) {
                return excursion;
            }
        }
        return null; // o lanzar excepción
    }

    public ArrayList<Excursion> filtrarFecha(Date fecha) {
        ArrayList<Excursion> resultado = new ArrayList<>();
        for (Excursion excursion : listaExcursiones) {
            if (excursion.getFecha().equals(fecha)) {
                resultado.add(excursion);
            }
        }
        return resultado;
    }

    public void eliminarExcursion(Excursion excursion) {
        listaExcursiones.remove(excursion);
    }

    public ArrayList<Excursion> getListaExcursiones() { // Método para obtener la lista de excursiones
        return listaExcursiones;
    }
}
