package model

class Cliente(var id: Int, var nombre: String) {

    var factura: Double = 0.0;
    var carrito: ArrayList<Producto>

    // nombre, id, factura, carrito
    init {
        carrito = ArrayList()
    }

    // agregar un producto al carrito
    fun agregarProducto(producto: Producto) {
        // no se podra agregar si hay un producto con ese id
        if (carrito.find { return@find it.id == producto.id } == null) {
            println("Agregado correctamente")
            carrito.add(producto)
            factura += producto.precio ?: 0.0
        } else
            println("El producto ya esta en el carrito")
    }

    fun mostrarProductos() {
        if (carrito.isNotEmpty()) {
            carrito.forEach {
                it.mostrarDatos()
            }
        } else {
            println("El carrito esta vacio")
        }
    }

    fun mostrarProducto(id: Int) {
        carrito.find { return@find it.id == id }?.mostrarDatos()
            ?: println("No se encuentra producto con ese id")
    }

    fun borrarxCategoria(categoria: Categoria) {
        val listaFiltrada = carrito.filter { it.categoria == categoria }
        when(listaFiltrada.size){
            0->{
                println("No hay productos con esa categoria")
            }
            1->{
                carrito.remove(listaFiltrada[0])
            }
            else->{
                println("Cuantos elementos quieres borrar")
                var nBorrados = readln().toInt()
                if (nBorrados==listaFiltrada.size){
                    carrito.removeAll(listaFiltrada)
                }else if(nBorrados<listaFiltrada.size){
                    for (i in 0..nBorrados-1){
                        carrito.remove(listaFiltrada[i])
                    }
                }
            }
        }
    }


}