fun main(){
    print("Introduce un número entero: ")
    var a = readln().toInt()

    if (a % 2 == 0){
        println("El número $a es par")
    } else {
        println("El número $a es impar")
    }
}