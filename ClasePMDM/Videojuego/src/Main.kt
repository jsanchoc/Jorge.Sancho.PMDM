import model.ClasificacionEdad
import model.VideojuegoAccion

fun main() {
    val BlackOps = VideojuegoAccion("BlackOpsII", "George", 2015, 30.0, ClasificacionEdad.PEGI18, 4, true)
    BlackOps.calcularPrecioFinal()
    BlackOps.mostrarDatos()
}