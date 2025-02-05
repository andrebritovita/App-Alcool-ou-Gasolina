package com.andrebritovita.appalcoolougasolina

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.andrebritovita.appalcoolougasolina.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val resultado = intent.getFloatExtra(KEY_CALCULO_ALCOOL_GASOLINA, 0.0F)
        if (resultado >= 0.7){
            binding.tvMelhorOpcao.text = "GASOLINA"
            binding.imvGasolina.setImageResource(R.drawable.gasolina)
        } else {
            binding.tvMelhorOpcao.text = "ÁLCOOL"
            binding.imvAlcool.setImageResource(R.drawable.alcool)
        }
    }
}