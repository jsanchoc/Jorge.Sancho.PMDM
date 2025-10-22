package model

abstract class Vehiculo (
    var matricula: String,
    var marca: String,
    var modelo: String,
    var km: Int,
    var cv: Int,
    var precio: Double
) {
    

    open fun mostrarDatos(){
        println("marca = ${marca}")
        println("\tmodelo = ${modelo}")
        println("\tkm = ${km}")
        println("\tcv = ${cv}")
        println("\tprecio = ${precio}")
        println("\tmatricula = ${matricula}")
    }
}