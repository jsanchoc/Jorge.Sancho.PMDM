fun main() {
    //Ejercicio 1
    var contador = 0
    val LIMITE = 10

    println("Contador: $contador")
    while (true){
        println("Contador: ${contador + 1}")
        contador ++
        if (contador == LIMITE){
            print("Limite Alcanzado")
            break
        }

    }


}
