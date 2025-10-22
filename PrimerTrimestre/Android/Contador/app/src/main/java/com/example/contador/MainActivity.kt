package com.example.contador

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.contador.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //lateinit var botonIncremen: Button
    lateinit var binding: ActivityMainBinding
    var contador: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        contador= savedInstanceState?.getInt("contador") ?: 0

        binding.textoContador.text = contador.toString()
        //valores grafico + logico
        //Para ir uno por uno
        //botonIncremen = findViewById(R.id.botonIncremento)
    }

    override fun onResume() {
        super.onResume()
        acciones()
    }

    private fun acciones(){
        /*binding.botonIncremento.setOnClickListener {
            Snackbar.make(it,
                "Pulsado incremento",
                Snackbar.LENGTH_LONG).show()
        }
        binding.botonDecremento.setOnClickListener {
            Snackbar.make(it,
                "Pulsado decremento",
                Snackbar.LENGTH_LONG).show()
        }*/
        binding.botonIncremento.setOnClickListener(this)
        binding.botonDecremento.setOnClickListener(this)
        binding.botonReseteo?.setOnClickListener(this)
    }

    @SuppressLint("ShowToast")
    override fun onClick(v: View?) {
        // id
        when(v!!.id){
            binding.botonIncremento.id->{
                // sumar uno a lo q hay en el texto
                contador++

            }
            binding.botonDecremento.id->{
                // restar uno a lo q hay en el texto
                contador--
            }
            binding.botonReseteo?.id->{
                if (binding.editReset!!.text.isEmpty()){
                    Snackbar.make(v, "Por favor, introduce datos", Snackbar.LENGTH_LONG).show()
                } else {
                    contador = binding.editReset?.text.toString().toInt()
                }
            }
        }
        binding.textoContador.text = contador.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("contador",contador)
    }

}