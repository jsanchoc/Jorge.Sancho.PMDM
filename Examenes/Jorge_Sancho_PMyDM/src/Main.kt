import model.ArmasBiologicas
import model.ArmasTradicionales
import model.Superheroes
import model.SuperheroesHumanos
import model.SuperheroesMutantes

fun main() {
    val IronMan = SuperheroesHumanos(1, "IronMan", 4, 4, true)
    IronMan.crear()
    IronMan.mostrarDatos()
    val SpiderMan = SuperheroesHumanos(2, "SpiderMan", 4, 4, true)
    SpiderMan.crear()
    SpiderMan.mostrarDatos()

    val Hulk = SuperheroesMutantes(3, "Hulk", 5, false)
    Hulk.crear()
    Hulk.mostrarDatos()
    val Venom = SuperheroesMutantes(4, "Venom", 5, false)
    Venom.crear()
    Venom.mostrarDatos()

    val Mjölnir = ArmasTradicionales(1, "Mjölnir", 10,95, 10000.0)
    Mjölnir.mostrarDatos()

    val VenenodeExtremis = ArmasBiologicas(2, "Veneno de Extremis", 95, 10, "Un virus basado en el simbionte Carnage, capaz de controlar el cuerpo y la mente de la víctima")
    VenenodeExtremis.mostrarDatos()
}

