fun main() {
    println((1..14).random())
    var gorra = Producto()
    var pantalones = Producto(2, 10.0)
    var zapatillas = Producto(3, 30.0, "Zapatillas")
    var cartera = Producto(4, 5.0, descripcion = "esta cartera es para guardar la pasta")
    var camiseta = Producto(1, 10.0, "camiseta", "camiseta para salir de fiesta")

    // gorra.mostrarDatos()
    // camiseta.mostrarDatos()
    val listaProductos: Array<Producto?> = arrayOf(gorra, pantalones, zapatillas, cartera, camiseta)
    // listaProductos[0] = null

    /* FOREACH -> Recorrer y
    listaProductos.forEach{
        it?.mostrarDatos() ?: println("Hueco vacio")
    }*/

    /*
    for (item in listaProductos){
        item?.mostrarDatos()
        if (item?.id == 1)
            item = null
    }*/
    for (i in 0..listaProductos.size-1){
        if (listaProductos[i]?.id == 1){
            listaProductos[i] = null
        }
    }
}