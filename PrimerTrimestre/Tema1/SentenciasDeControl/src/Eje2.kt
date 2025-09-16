fun main() {
    print("Introduce un número entero: ")
    var a = readln().toInt()

    if (a < 0){
        println("El número $a es negativo")
    } else if (a == 0){
        println("El número $a es cero")
    } else {
        println("El número $a es positivo")
    }
}