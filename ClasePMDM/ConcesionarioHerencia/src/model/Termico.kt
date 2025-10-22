package model

class Termico(
    matricula: String,
    marca: String,
    modelo: String,
    km: Int,
    cv: Int,
    precio: Double,
    nPuertas: Int,
    capacidadMaletero: Int,
    var autonomiaT: Int,
    ) : Coche(matricula,marca,modelo,km,cv,precio,nPuertas,capacidadMaletero) {

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("autonomiaT = ${autonomiaT}")
    }
    }