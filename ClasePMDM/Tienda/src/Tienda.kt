class Tienda (var nombre: String?= null){
    var caja: Double = 0.0
    var almacen: Array<Producto?>

    init {
        almacen = arrayOfNulls(5)
    }

    fun mostrarProductos() {
        var nulos: Int = 0
        almacen.forEach {
            it?.mostrarDatos() ?: nulos++
        }
        if (nulos == almacen.size)
            println("Almacén Vacio")
    }

    fun meterProductos() {
        for (item)
    }
    ]

}