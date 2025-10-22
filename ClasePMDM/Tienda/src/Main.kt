
import model.Categoria
import model.Cliente
import model.Producto
import model.Tienda

fun main() {
    val botas = Producto("Salomon",arrayOfNulls(3), 0.0,1, 35.0, "Botas Montaña", "Mejores botas de montaña para disfrutar tus rutas comodamente.", Categoria.Ropa)
    val mochila = Producto("The North Face", arrayOfNulls(3), 0.0, 2, 25.0, "Mochila Trekking", "Mochila de 30L ideal para senderismo.", Categoria.Generica)
    val pantalon = Producto("Salomon", arrayOfNulls(3), 0.0, 3, 40.0, "Pantalón Montaña", "Pantalón impermeable y ligero.", Categoria.Ropa)

    var option: Int = 0
    while (true){
        println("************MENU************")
        println("*1. Agragar Producto       *");
        println("*2. Mostrar Productos      *");
        println("*3. Mostrar Datos          *");
        println("*4. Filtrar Por Categoria  *");
        println("*5. Salir                  *");
        println("****************************");
        println("Elije una opción: ");

        option = readln().toInt()
        when(option){
            1 -> botas.agregarProducto(botas)
            2 -> botas.mostrarProductos()
            3 -> botas.mostrarDatos()
            4 -> botas.filtrarCategoria(Categoria.Ropa)
            5 -> break
        }
    }
}
