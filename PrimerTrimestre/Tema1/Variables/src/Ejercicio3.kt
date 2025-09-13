import kotlin.io.path.fileVisitor

fun main() {
    fun calcularDescuento(precio: Int? = null) {
        val precioBase = precio ?: 100
        println("El precio base es: $precioBase")

        val descuento = if (precioBase > 50) {
            precioBase * 0.10
        }
        else {
            precioBase * 0.05
        }
        println("El descuento aplicado es: $descuento")

        val precioFinal = precioBase - descuento
        println("El precio final es: $precioFinal")
    }

    calcularDescuento(null)
    println()
    calcularDescuento(30)
}

