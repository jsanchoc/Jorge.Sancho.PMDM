package model

class ArmasTradicionales(
    id: Int,
    nombre: String,
    nivelPotencia: Int,
    nivelDano: Int,
    var peso: Double
) : Armas(id, nombre, nivelPotencia, nivelDano){

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("\tpeso = $peso")
    }
}