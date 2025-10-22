package model

class SuperheroesHumanos (
    id: Int,
    nombre: String,
    nivel: Int,
    var resistencia: Int,
    var armaTradicional: Boolean
) : Superheroes (id, nombre, nivel) {

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("\tresistencia = $resistencia")
        println("\tarmaTradicional = $armaTradicional")
    }

    override fun crear() {
        super.crear()
        println("Dame una resistencia: ")
        resistencia = readln().toInt()
        println("Arma tradicional?: ")
        armaTradicional = readln().toBoolean()
    }
}


