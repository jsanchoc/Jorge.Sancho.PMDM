package model

abstract class Videojuego(
    var titulo : String,
    var desarrollador : String,
    var añoLanzamiento : Int,
    var precio : Double,
    var clasificacionEdad: ClasificacionEdad
) {


    override fun toString(): String {
        return "Videojuego(titulo='$titulo', desarrollador='$desarrollador', añoLanzamiento=$añoLanzamiento, precio=$precio, clasificacionEdad=$clasificacionEdad)"
    }

    open fun calcularPrecioFinal(){}

    open fun mostrarDatos(){
        println("titulo = ${titulo}")
        println("desarrollador = ${desarrollador}")
        println("añoLanzamiento = ${añoLanzamiento}")
        println("precio = ${precio}")
        println("clasificacionEdad = ${clasificacionEdad}")
    }
}