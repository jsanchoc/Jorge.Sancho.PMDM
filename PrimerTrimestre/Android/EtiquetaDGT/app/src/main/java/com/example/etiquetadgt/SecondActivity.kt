package com.example.etiquetadgt

import android.R
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.etiquetadgt.databinding.ActivityMainBinding
import com.example.etiquetadgt.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(){
        private lateinit var binding: ActivitySecondBinding
        private lateinit var nombre: String
        private lateinit var matricula: String
        private lateinit var anoMatriculacion: String
        private lateinit var tipoGasolina: String
        private lateinit var autonomia: String


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivitySecondBinding.inflate(layoutInflater)
            setContentView(binding.root)
            capturarDatos()
            acciones()
        }

    private fun acciones() {
        if (tipoGasolina == "Eléctrico"){
            binding.etiqueta.setText("etiqueta 0")
        } else if (tipoGasolina == "Híbrido" && autonomia.toInt() > 80){
            binding.etiqueta.setText("etiqueta 0")
        } else if (tipoGasolina == "Híbrido" && autonomia.toInt() < 80){
            binding.etiqueta.setText("etiqueta eco")
        } else if (tipoGasolina == "Diésel" && anoMatriculacion.toInt() in 2006..2015){
            binding.etiqueta.setText("etiqueta C")
        } else if (tipoGasolina == "Gasolina" && anoMatriculacion.toInt() in 2008..2017){
            binding.etiqueta.setText("etiqueta C")
        } else {
            binding.etiqueta.setText("etiqueta B")
        }
    }

    private fun setImageResoruce(drawable: Drawable) {

    }

    private fun capturarDatos() {
        nombre = intent.extras?.getString("nombre").toString();
        matricula = intent.extras?.getString("matricula").toString();
        anoMatriculacion = intent.extras?.getString("anoMatriculacion").toString();
        tipoGasolina = intent.extras?.getString("tipoGasolina").toString();
        autonomia = intent.extras?.getString("autonomia").toString();
    }
}