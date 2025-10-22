package model

abstract class Superheroes(
    var id: Int,
    var nombre: String,
    var nivel: Int
) {
    open fun mostrarDatos(){
        println("id = $id")
        println("\tnombre = $nombre")
        println("\tnivel = $nivel")
    }

    open fun crear(){
        println("Dame un id: ")
        id = readln().toInt()
        println("Dame un nombre: ")
        nombre = readln().toString()
        println("Dame un nivel: ")
        nivel = readln().toInt()
    }
}