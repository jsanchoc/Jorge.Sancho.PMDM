fun main(args: Array<String>){
    /*
    val DNI = "12332145E"
    var nombre: String = "Jorge"
    var edad: Number = 41;
    lateinit var correo: String
    var direccion: String? = "Pozuelo"


    println("Primer programa de repaso kotlin")
    correo = "jorge.sancho@gmail.com"
    println("Hola mi nombre es ${nombre}, tengo ${edad}" +
            " y mi correo es ${correo}")
    println("Mi nombre tiene ${nombre.length * 2} letras")
    println("Vivo en: ${direccion?.length ?: "sin definir"}")


    print("A quien quieres saludar: ")
    nombre = readln()
    print("Cuantas veces quieres hacerlo: ")
    var veces:Int = readln().toInt()

    saludar(nombre = nombre, veces= veces)
     */

    println("El resultado de la operación es ${sumaLambda(1,3)}")
    println("H")

}

fun saludar(nombre: String="Pepe", veces: Int=4) {
    // Saludar a la persona con el nombre ="Jorge"
    // pasado un numero determinado de veces = 2
    for (i in 0 .. veces -1)
        println("Hola $nombre que tal estás")
}


var sumaLambda: (Int, Int) -> Int = {op1, op2 -> op1+op2}

fun sentenciaWhen(opcion: Int){
    when(opcion){
        1 -> {
            println("Entrando por ejecucion de caso 1")
        }
        2..5 -> {
            println("Entrando por ejecucion de caso 2 a 5")
        }
        !in 5..7 -> {
            println("Entrando por ejecución de caso sin ser 5 y 7")
        }
        else -> {
            println("Entrando por caso no contemplado")

        }

    }
}

fun sentenciaFor() {
    for (item in 0..10 step 2){
        println(item)
    }
    for (item in 10 downTo 0 step 2){

    }
}
