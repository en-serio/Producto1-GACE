public class aaa {
}
@startuml
'https://plantuml.com/class-diagram


        package "Modelo" {
abstract class Socio
class SocioEstandar extends Socio
class SocioFederado extends Socio
class SocioInfantil extends Socio



abstract class Socio{
        - noSocio: String
        - nombre: String
        - tipoSocio: enum TipoSocio
        + getNoSocio(): String
        + getNombre(): String
        + getTipoSocio(): TipoSocio
        + setNoSocio(nombre: String): void
        + setNombre(nombre: String): void
        + setTipoSocio(tipoSocio: TipoSocio): void
        + calcularCuota(): double
        + costeExcursion(excursion: Excursion): double
        + Socio()
        + Socio(noSocio: String, nombre: String, tipoSocio: TipoSocio)
        + toString(): String
}

class SocioEstandar {
        - nif: String
        - seguro: Seguro
        + getNif(): String
        + getSeguro(): Seguro
        + setNif(nif: String): void
        + setSeguro(seguro: Seguro): void
        + SocioEstandar()
        + SocioEstandar(noSocio: String, nombre: String, tipoSocio: TipoSocio, nif: String, seguro: Seguro)
}

class SocioFederado {
        - nif: String
        - federacion: Federacion
        - DtoCuota: Int
        - DtoExcursion: Int
        + getNif(): String
        + getFederacion(): Federacion
        + setNif(nif: String): void
        + setFederacion(federacion: Federacion): void
        + SocioFederado()
        + SocioFederado(noSocio: String, nombre: String, tipoSocio: TipoSocio, nif: String, federacion: Federacion)
}

class SocioInfantil {
        - noTutor: String
        - DtoCuota: Int
        + getNoTutor(): String
        + setNoTutor(noTutor: String): void
        + SocioInfantil()
        + SocioInfantil(noSocio: String, nombre: String, tipoSocio: TipoSocio, noTutor: String)
}

class Excursion {
        - codigo: String
        - descripcion: String
        'Date o DateTime?
                - fecha: Date
        - noDias: int
        - precio: double
        + getCodigo(): String
        + getDescripcion(): String
        + getFecha(): Date
        + getNoDias(): int
        + getPrecio(): precio
        + setCodigo(codigo: String): void
        + setDescripcion(descripcion: String): void
        + setFecha(fecha: Date): void
        + setNoDias(noDias: int): void
        + setPrecio(precio: double): void
        + Excursion()
        + Excursion(codigo: String, descripcion: String, fecha: Date, noDias: int,precio: double)
        + calcPrecio(socio: Socio)
}

class Seguro {
        - idSeguro: int
        - tipo: boolean
        '- tipo: TipoSeguro
                - precio: double
        + getSeguro(): boolean
        '+ getIdSeguro(): int
                + getTipo(): TipoSeguro
        + getPrecio(): double
        '+ setIdSeguro(idSeguro: int) : void
                + setIdSeguro(seguro: boolean) : void
        + setTipo(tipo: TipoSeguro): void
        + setPrecio(precio: double): void
        + Seguro()
        + Seguro(idSeguro: int, /'tipoSeguro: TipoSeguro'/seguro: boolean, precio: double)
}

class Federacion{
        - codigo: String
        - nombre: String
        + getCodigo(): String
        + getNombre(): String
        + setCodigo(codigo: String): void
        + setNombre(nombre: String): void
        + Federacion()
        + Federacion(codigo: String, nombre: String)
}

class Inscripcion {
        - noInscripcion: String
        - socio: Socio
        - excursion: Excursion
        - fechaInsc: Date
        + getIdInscripcion(): String
        + getSocio(): Socio
        + getExcursion(): Excursion
        + getFechaInsc(): Date
        + setIdInscripcion(idInscripcion: String): void
        + setSocio(socio: Socio): void
        + setExcursion(excursion: Excursion): void
        + setFechaIncs(fechaInsc: Date): void
        + Inscripcion()
        + Inscripcion(idInscripcion: String, socio: Socio, excursion: Excursion)
        + cancelarInscripcion(): boolean
}

class ListaSocios {
        - listaSocio: ArrayList<Socio>
        + anyadirSocio(socio: Socio): void
        + eliminarSocio(noSocio: String): void
        + buscarSocio(noSocio: String): Socio
        + filtrarPorTipo(tipo: TipoSocio): ArrayList<Socio>
        + eliminarSocio(socio: Socio): void
}

class ListaExcursion {
        - listaExcursiones: ArrayList<Excursion>
        + anyadirExcursion(excursion: Excursion): void
        + getExcursion(codigo: String): Excursion
        + filtrarFecha(fecha: Date): ArrayList<Excursion>
        + eliminarExcursion(excursion: Excursion): void
}

class ListaInscripcion {
        - listaInsc: ArrayList<Inscripcion>
        + anyadirInscripcion(excursion: Excursion): void
        + getInscripcion(idInscripcion: String): Inscripcion
        + eliminarInscripcion:(inscripcion: Inscripcion): void
        + filtraSocio(socio: Socio): ArrayList<Inscripcion>
        + filtrarFecha(fecha: Date): ArrayList<Inscripcion>
}

/'
enum TipoSeguro {
    BÁSICO
    COMPLETO
    }


TipoSeguro <--> Seguro
'/
enum TipoSocio {
    ESTÁNDAR
    FEDERADO
INFANTIL
    }

TipoSocio <--> Socio

}

        package Vista{
    class VistaSocios {
        + mostrarSocios(lista: ArrayList<Socio>): void
        + detalleSocio(socio: Socio): void
        + formSocio(): Socio
    }

    class VistaExcursion {
        + mostrarExcursiones(lista: ArrayList<Excursion>): void
        + detalleExcursion(excursion: Excursion): void
        + formExcursion(): Excursion
    }

    class VistaInscripciones {
        + mostrarInscripciones(lista: ArrayList<Inscripcion>): void
        + formInscripcion(): Inscripcion
    }
}

package Controlador {
    class SocioControlador{
        - listaSocios: ListaSocios
        - vistaSocios: VistaSocios
        + gestionarSocios(): void
        + crearSocio(): void
        + eliminarSocio(noSocio: String): void
        + mostrarDetalleSocio(noSocio: String): void
    }

    class InscripcionControlador {
        - listaInscr: ListaInscripcion
        - vistaInscr: VistaInscripciones
        + gestionarInscr(): void
        + crearInsc(): void
        + eliminarInscr(idInscr: String): void
        + mostrarDetalleInscr(idInscr: String): void
    }

    class ExcursionControlador {
        - listaExcursiones: ListaExcursion
        - vistaExcursion: VistaExcursion
        + gestionarExcursion(): void
        + crearExcursion(): void
        + eliminarExcursion(codigo: String): void
        + mostrarDetalleExcursion(codigo: String): void
    }
}

/'
Acabo de ver que las clases importantes tienen un nombre de id
distinto porque soy muuy listo
'/

ListaSocios *-- "0..*" Socio
ListaExcursion *-- "0..*" Excursion
ListaInscripcion *-- "0..*" Inscripcion

SocioEstandar --|> Seguro
SocioFederado --|> Federacion

SocioInfantil --> Socio : tutor

SocioControlador ..> ListaSocios : utiliza
SocioControlador ..> VistaSocios : utiliza

InscripcionControlador ..> ListaInscripcion : utiliza
InscripcionControlador ..> VistaInscripciones : Utiliza

ExcursionControlador ..> ListaExcursion : utiliza
ExcursionControlador ..> VistaExcursion : utiliza

Inscripcion --> Socio
Inscripcion --> Excursion

@enduml