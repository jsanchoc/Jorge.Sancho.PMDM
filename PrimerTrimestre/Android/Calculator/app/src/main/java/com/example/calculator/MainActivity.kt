package com.example.calculator
import kotlin.math.*
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var binding: ActivityMainBinding
    private var display = "0"
    private var operador1 = 0.0
    private var operador = ""
    private var nuevoNumero = true

    private var numeroPi = 3.1416


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        acciones()

        display = savedInstanceState?.getString("display") ?: ""



    }

    override fun onResume() {
        super.onResume()
        acciones()
    }

    private fun acciones(){
        val numeros = listOf(binding.numero0, binding.numero1, binding.numero2, binding.numero3,
            binding.numero4, binding.numero5, binding.numero6, binding.numero7, binding.numero8,
            binding.numero9)
        for(boton in numeros) boton.setOnClickListener(this)

        val operadores = listOf(
            binding.botonSuma, binding.botonResta,
            binding.botonMultiplicacion, binding.botonDivision
        )
        for (boton in operadores) boton.setOnClickListener(this)
        
        binding.botonComa.setOnClickListener(this)
        binding.botonDelete.setOnClickListener(this)
        binding.bontonAC.setOnClickListener(this)
        binding.botonIgual.setOnClickListener(this)
        binding.botonPorcentaje.setOnClickListener(this)
        binding.botonMasMenos.setOnClickListener(this)
        binding.botonPotencia?.setOnClickListener(this)
        binding.botonPotencia2?.setOnClickListener(this)
        binding.botonPotencia3?.setOnClickListener(this)
        binding.botonPi?.setOnClickListener(this)
        binding.botonRaiz?.setOnClickListener(this)
        binding.botonSeno?.setOnClickListener(this)
        binding.botonCoseno?.setOnClickListener(this)
        binding.botonTangente?.setOnClickListener(this)
        binding.botonParentesisAbrir?.setOnClickListener(this)
        binding.botonParentesisCerrar?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            binding.numero0.id, binding.numero1.id, binding.numero2.id, binding.numero3.id,
            binding.numero4.id, binding.numero5.id, binding.numero6.id, binding.numero7.id, binding.numero8.id,
            binding.numero9.id -> escribirNumero((v as Button).text.toString())

            binding.botonComa.id -> escribirComa()

            binding.botonDelete.id -> borrar()

            binding.bontonAC.id -> limpiar()

            binding.botonIgual.id -> calcularResultado()

            binding.botonSuma.id -> operar("+")
            binding.botonResta.id -> operar("-")
            binding.botonMultiplicacion.id -> operar("*")
            binding.botonDivision.id -> operar("/")
            binding.botonPorcentaje.id -> aplicarPorcentaje()
            binding.botonMasMenos.id -> cambiarSigno()
            binding.botonPotencia?.id -> potenciarx()
            binding.botonPotencia2?.id -> potenciara2()
            binding.botonPotencia3?.id -> potenciara3()
            binding.botonPi?.id -> pi()
            binding.botonRaiz?.id -> calcularRaiz()
            binding.botonSeno?.id -> calcularSeno()
            binding.botonCoseno?.id -> calcularCoseno()
            binding.botonTangente?.id -> calcularTangente()
            binding.botonParentesisAbrir?.id -> abrirParentesis()
            binding.botonParentesisCerrar?.id -> cerrarParentesis()
        }

    }

    private fun abrirParentesis() {
        if (nuevoNumero || display == "0") {
            display = "("
            nuevoNumero = false
        } else {
            display += "("
        }
        binding.display.text = display
    }

    private fun cerrarParentesis() {
        display += ")"
        binding.display.text = display
    }

    private fun calcularSeno() {
        if (display.isNotEmpty()) {
            val valor = Math.toRadians(display.toDouble()) // convierte a radianes
            val resultado = sin(valor)
            display = resultado.toString()
            binding.display.text = display
        }
    }

    private fun calcularCoseno() {
        if (display.isNotEmpty()) {
            val valor = Math.toRadians(display.toDouble())
            val resultado = cos(valor)
            display = resultado.toString()
            binding.display.text = display
        }
    }

    private fun calcularTangente() {
        if (display.isNotEmpty()) {
            val valor = Math.toRadians(display.toDouble())
            val resultado = tan(valor)
            display = resultado.toString()
            binding.display.text = display
        }
    }

    private fun calcularRaiz() {
        if (display.isNotEmpty()) {
            val valor = sqrt(display.toDouble())
            display = if (valor % 1 == 0.0)
                valor.toInt().toString()
            else
                valor.toString()
            binding.display.text = display
        }
    }

    private fun pi() {
        if (nuevoNumero || display == "0"){
            display = Math.PI.toString()
            nuevoNumero = false
        } else{
            display += "*${Math.PI}"
        }
        binding.display.text = "π"
    }

    private fun potenciara3() {
        if (display.isNotEmpty()) {
            val valor = display.toDouble().pow(3)
            display = if (valor % 1 == 0.0)
                valor.toInt().toString()
            else
                valor.toString()
            binding.display.text = display
        }
    }

    private fun potenciara2() {
        if (display.isNotEmpty()) {
            val valor = display.toDouble().pow(2)
            display = if (valor % 1 == 0.0)
                valor.toInt().toString()
            else
                valor.toString()
            binding.display.text = display
        }
    }

    private fun potenciarx() {
        if (display.isNotEmpty()){
            operador1 = display.toDouble()
            operador = "^"
            nuevoNumero = true
        }
    }

    private fun cambiarSigno() {
        if (display.isNotEmpty() && display != "0") {
            val valor = display.toDouble() * -1
            display = if (valor % 1 == 0.0)
                valor.toInt().toString()
            else
                valor.toString()
            binding.display.text = display
        }
    }

    private fun aplicarPorcentaje() {
        if (display.isNotEmpty()){
            val valor = display.toDouble() / 100
            display = if (valor % 1 == 0.0)
                valor.toInt().toString()
            else
                valor.toString()
            binding.display.text = display
        }
    }

    private fun escribirNumero(num: String) {
        if(nuevoNumero || display == "0") {
            display = num
            nuevoNumero = false
        } else {
            display += num
        }
        binding.display.text = display
    }
    private fun escribirComa() {
        if (nuevoNumero) {
            display = "0."
            nuevoNumero = false
        } else if (!display.contains(".")) {
            display += "."
        }
        binding.display.text = display
    }

    private fun borrar(){
        if (display.isNotEmpty() && !nuevoNumero){
            display = display.dropLast(1)
            if (display.isEmpty()) {
                display = "0"
                nuevoNumero = true
            }
            binding.display.text = display
        }
    }
    private fun limpiar() {
        display = "0"
        operador1 = 0.0
        operador = ""
        nuevoNumero = true
        binding.display.text = display
    }

    private fun operar(op: String) {
        if (display.isNotEmpty()) {
            operador1 = display.toDouble()
            operador = op
            nuevoNumero = true
        }
    }

    private fun calcularResultado() {
        if (operador.isEmpty() || display.isEmpty()) return

        val operando2 = display.toDouble()
        val resultado = when (operador) {
            "+" -> operador1 + operando2
            "-" -> operador1 - operando2
            "*" -> operador1 * operando2
            "/" -> if (operando2 != 0.0) operador1 / operando2 else Double.NaN
            "^" -> operador1.pow(operando2)
            else -> operando2
        }

        // Formato bonito (sin .0 innecesario)
        display = if (resultado % 1 == 0.0) resultado.toInt().toString() else resultado.toString()
        binding.display.text = display
        operador = ""
        nuevoNumero = true
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("calculadora", display)
    }



}