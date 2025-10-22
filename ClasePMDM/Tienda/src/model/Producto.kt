package model

class Producto(
    nombreTienda: String? = null,
    almacen: Array<Producto?> = arrayOfNulls(3),
    caja: Double = 0.0,
    var id: Int? = null,
    var precio: Double? = null,
    var nombre: String? = null,
    var descripcion: String? = null,
    var categoria: Categoria= Categoria.Generica
) : Tienda(nombreTienda, caja, almacen) {

    // hacer un metodo que muestre todos los datos del producto
    // en caso de no tener dato, aparecera el mensaje de SIN DEFINIR

    override fun mostrarDatos() {
        super.mostrarDatos()
        println("id = ${id}")
        println("precio = ${precio}")
        println("nombre = ${nombre}")
        println("descripcion = ${descripcion}")
        println("categoria = ${categoria}")
    }

    override fun agregarProducto(producto: Producto) {
        super.agregarProducto(producto)
    }

    override fun filtrarCategoria(categoria: Categoria) {
        super.filtrarCategoria(categoria)
    }

    override fun mostrarProductos() {
        super.mostrarProductos()
    }
}