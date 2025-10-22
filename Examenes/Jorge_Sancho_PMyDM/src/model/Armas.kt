package model

abstract class Armas (
    var id: Int,
    var nombre: String,
    var nivelPotencia: Int,
    var nivelDano: Int
){

    open fun mostrarDatos(){
        println("id = $id")
        println("\tnombre = $nombre")
        println("\tnivelPotencia = $nivelPotencia")
        println("\tnivelDano = $nivelDano")
    }
}


