package model

class ArmasBiologicas (
    id: Int,
    nombre: String,
    nivelPotencia: Int,
    nivelDano: Int,
    var descripcion: String
) : Armas(id, nombre, nivelPotencia, nivelDano){

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("\tdescripcion = $descripcion")
    }


}