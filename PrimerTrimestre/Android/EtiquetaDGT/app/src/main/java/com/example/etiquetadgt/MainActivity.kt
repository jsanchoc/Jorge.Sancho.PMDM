package com.example.etiquetadgt

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.etiquetadgt.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        acciones()
    }

    override fun onResume() {
        super.onResume()
        acciones()
    }

    private fun acciones() {
        !binding.autonomia.isEnabled
        if (binding.tipoGasolina.selectedItem.toString() == "Híbrido") {
            binding.anoMatriculacion.setText("2018")
            !binding.anoMatriculacion.isEnabled
            binding.autonomia.isEnabled
        }
        binding.boton.setOnClickListener { v ->
            val nombre = binding.name.text
            val matricula = binding.matricula.text
            val anoMatriculacion = binding.anoMatriculacion.text
            val tipoGasolina = binding.tipoGasolina.selectedItem
            val autonomia = binding.autonomia.text
            if (nombre.isEmpty() || matricula.isEmpty() || anoMatriculacion.isEmpty() || autonomia.isEmpty()){
                Snackbar.make(v, "Faltan Datos", Snackbar.LENGTH_SHORT).show()
            } else {
                val intent: Intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("nombre", nombre)
                intent.putExtra("matricula", matricula)
                intent.putExtra("anoMatriculacion", anoMatriculacion)
                intent.putExtra("tipoGasolina", tipoGasolina.toString())
                intent.putExtra("autonomia", autonomia)
                startActivity(intent)
            }

        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}