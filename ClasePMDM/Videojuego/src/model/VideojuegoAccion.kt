package model

class VideojuegoAccion(
    titulo : String,
    desarrollador : String,
    añoLanzamiento : Int,
    precio : Double,
    clasificacionEdad: ClasificacionEdad,
    var nivelViolencia : Int,
    var modoMultijugador : Boolean
) : Videojuego (titulo, desarrollador, añoLanzamiento, precio,clasificacionEdad){

    override fun toString(): String {
        return super.toString()
    }

    override fun calcularPrecioFinal() {
        super.calcularPrecioFinal()
        if (nivelViolencia > 3)
            precio = precio + precio * 0.05
        if (modoMultijugador)
            precio = precio + precio * 0.10
    }

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("nivelViolencia = ${nivelViolencia}")
        println("modoMultijugador = ${modoMultijugador}")
    }

}