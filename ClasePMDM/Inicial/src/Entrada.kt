fun main(args: Array<String>){

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



}

fun saludar(nombre: String="Pepe", veces: Int=4) {
    // Saludar a la persona con el nombre ="Jorge"
    // pasado un numero determinado de veces = 2
    for (i in 0 .. veces -1)
        println("Hola $nombre que tal estás")
}


var sumaLambda: (Int, Int) -> Int =