import java.util.ArrayList;
import java.util.Scanner;

public class VistaSocios {
    private Scanner scanner;

    public VistaSocios() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarSocios(ArrayList<Socio> lista) {
        System.out.println("Lista de Socios:");
        for (Socio socio : lista) {
            System.out.println(socio);
        }
    }

    public void detalleSocio(Socio socio) {
        System.out.println("Detalles del Socio:");
        System.out.println("Número de Socio: " + socio.getNoSocio());
        System.out.println("Nombre: " + socio.getNombre());
        System.out.println("Tipo de Socio: " + socio.getTipoSocio());
        // Agregar más detalles según sea necesario
    }

    public Socio formSocio() {
        System.out.print("Ingrese el número de socio: ");
        String noSocio = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo de socio (ESTÁNDAR, FEDERADO, INFANTIL): ");
        TipoSocio tipoSocio = TipoSocio.valueOf(scanner.nextLine().toUpperCase());

        Socio socio = null;
        switch (tipoSocio) {
            case ESTÁNDAR:
                System.out.print("Ingrese el NIF: ");
                String nifEstandar = scanner.nextLine();
                System.out.print("Ingrese el precio del seguro: ");
                double precioSeguro = Double.parseDouble(scanner.nextLine());
                Seguro seguroEstandar = new Seguro(1, true, precioSeguro); // Aquí puedes definir la lógica para el ID del seguro
                socio = new SocioEstandar(noSocio, nombre, tipoSocio, nifEstandar, seguroEstandar);
                break;
            case FEDERADO:
                System.out.print("Ingrese el NIF: ");
                String nifFederado = scanner.nextLine();
                System.out.print("Ingrese el código de la federación: ");
                String codigoFederacion = scanner.nextLine();
                Federacion federacion = new Federacion(codigoFederacion, "Federación de Ejemplo"); // Aquí puedes definir la lógica para crear la federación
                socio = new SocioFederado(noSocio, nombre, tipoSocio, nifFederado, federacion);
                break;
            case INFANTIL:
                System.out.print("Ingrese el número de tutor: ");
                String noTutor = scanner.nextLine();
                socio = new SocioInfantil(noSocio, nombre, tipoSocio, noTutor);
                break;
        }

        return socio;
    }
}
