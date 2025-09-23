fun main() {
    print("Introduce un número entero: ")
    var entero = readln().toInt()
    esPrimo(entero)

}

fun esPrimo(entero: Int){
    if (entero > 1 && entero % entero == 0 && entero % 1 == 0){
        println("es primo")
    } else {
        println("no es primo")
    }
}