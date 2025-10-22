import model.Camion
import model.Coche
import model.Coleccionable
import model.Electrico
import model.Hibrido
import model.Moto
import model.Termico
import model.Vehiculo
import kotlin.reflect.typeOf

fun main() {
    var ducati = Moto(
        "1234MNR", "Ducati", "Panigale V4",
        0, 240, 30000.0, false, "L")
    ducati.mostrarDatos()
    ducati.realizarCaballito()

    /*var bmw = Coche(
        "2628LFH", "BMW", "M2",
        0, 420, 75000.0, 3, 60)
    bmw.mostrarDatos()
    bmw.almacenarMaletero(23)
     */

    val listaVehiculos: ArrayList<Vehiculo> = arrayListOf()
    listaVehiculos.add(ducati)

    listaVehiculos.forEach {
        it.mostrarDatos()
    }

    var bmw = Termico("1234MNR", "BMW", "M2",
        0, 380, 75000.0, 3, 60, 800)
    var volvo = Hibrido("4321LFH", "Volvo", "XC60",
        0, 380, 80000.0, 5, 120, 600, 70)
    var ford = Electrico("9285GTB", "Ford", "Match E",
        0, 280, 50000.0, 5, 100, true,350)

    var camion = Camion("1294MNR", "Volvo", "Chope",
        0, 650, 300000.0, 10000.0)
    bmw.mostrarDatos()
    volvo.mostrarDatos()
    ford.mostrarDatos()

    listaVehiculos.forEach {
        if (it is Coleccionable){
            it.incrementarValor()
        }
        it.mostrarDatos()
    }
}