package com.example.formulario

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.formulario.databinding.ActivityMainBinding
import com.example.formulario.model.Usuario
import com.google.android.material.snackbar.Snackbar
import kotlin.math.exp

class MainActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        acciones()
        }

    private fun acciones() {
        binding.botonEnviar.setOnClickListener {
            val nombre = binding.name.text.toString()
            val mail = binding.mail.text.toString()
            val pass = binding.password.text.toString()
            val location = binding.location.text.toString()
            val experiencia = binding.checkBox.isChecked
            lateinit var cantidad: String
            when (binding.grupoRadios.checkedRadioButtonId) {
                binding.radioCinco.id -> {
                    cantidad = "menos de 5"
                }

                binding.radioMasCinco.id -> {
                    cantidad = "mas de 5"
                }
            }
            val estudios = binding.puesto.selectedItem
            if (nombre.isNotEmpty() && mail.isNotEmpty() && pass.isNotEmpty() && location.isNotEmpty()) {
                if (mail == "admin@admin.com" && pass == "admin") {
                    val intent: Intent = Intent(applicationContext, SecondActivity::class.java)
                    val usuario = Usuario(nombre, pass, mail, location, estudios.toString(), experiencia.toString())
                    intent.putExtra("usuario", usuario)
                    // intent.putExtra("correo", mail)
                    startActivity(intent)
                } else{
                    Snackbar.make(it, "Datos Incorrectos", Snackbar.LENGTH_SHORT).show()
                }
            } else {
                Snackbar.make(it, "Faltan Datos", Snackbar.LENGTH_SHORT).show()
            }

        }
        binding.checkBox.setOnCheckedChangeListener { view, data ->
            binding.radioCinco.isEnabled = data
            binding.radioMasCinco.isEnabled = data
            binding.grupoRadios.check(-1)
        }
        binding.grupoRadios.setOnCheckedChangeListener { view, element ->
            when (element) {
                binding.radioCinco.id -> {
                    Log.v("radios", "Seleccionado el de Menos cinco")
                }

                binding.radioMasCinco.id -> {
                    Log.v("radios", "Seleccionado el de Mas cinco")
                }
            }
        }
        binding.puesto.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Log.v("spinner", binding.puesto.selectedItem.toString())
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}
