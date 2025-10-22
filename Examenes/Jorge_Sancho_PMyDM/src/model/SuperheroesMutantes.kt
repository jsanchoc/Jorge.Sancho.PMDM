package model

class SuperheroesMutantes(
    id: Int,
    nombre: String,
    nivel: Int,
    var armaBiologica: Boolean
) : Superheroes(id, nombre, nivel) {

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("\tarmaBiologica = $armaBiologica")
    }

    override fun crear() {
        super.crear()
        println("Arma Biológica?: ")
        armaBiologica = readln().toBoolean()
    }

}

