package model

abstract class Tienda(var nombreTienda: String? = null, var caja: Double = 0.0, var almacen: Array<Producto?>) {


    init {
        almacen = arrayOfNulls(5)
    }


    open fun mostrarProductos() {
        var nulos: Int = 0;
        // [p1,null,p2, null]
        almacen.forEach {
            it?.mostrarDatos() ?: nulos++
        }

        if (nulos == almacen.size)
            println("El almacen esta vacio")
    }

    open fun agregarProducto(producto: Producto) {

        val busqueda: Producto? = almacen.find {
            return@find it?.id == producto.id
        }

        for (i in almacen.indices) {
            if (almacen[i] == null && busqueda==null) {
                almacen[i] = producto
                println("Producto agregado correctamente")
                return
            }
        }
        println("No hay espacio disponible o esta repetido")
    }


    open fun filtrarCategoria(categoria: Categoria) {
        val listaFiltrada: ArrayList<Producto?> = almacen.filter {
            return@filter it?.categoria == categoria
        } as ArrayList<Producto?>
    }

    open fun mostrarDatos(){
        println("nombre = ${nombreTienda}")
    }
}