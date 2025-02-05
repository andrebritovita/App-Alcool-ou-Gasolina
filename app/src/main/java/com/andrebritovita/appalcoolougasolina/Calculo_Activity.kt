package com.andrebritovita.appalcoolougasolina

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.andrebritovita.appalcoolougasolina.databinding.ActivityCalculoBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CalculoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculoBinding
    var resultado: Float = 0.0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalcular.setOnClickListener {
            calculaMelhorPreco ()
        }
    }
    private fun calculaMelhorPreco() {
        val precoAlcool = binding.edtAlcool.text.toString()
        val precoGasolina = binding.edtGasolina.text.toString()
        val resultadoValidado = validarCampos(precoAlcool, precoGasolina)
        if (resultadoValidado){
            val alcoolStr = precoAlcool.toFloat()
            val gasolinaStr = precoGasolina.toFloat()
            resultado = alcoolStr/ gasolinaStr
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(KEY_CALCULO_ALCOOL_GASOLINA, resultado)
            startActivity(intent)
        }
    }
    private fun validarCampos(pAlcool: String, pGasolina: String): Boolean {
        if(pAlcool.isEmpty()){
            binding.edtAlcool.error = "Digite o preço do álcool!"
            binding.edtAlcool.requestFocus()
            binding.edtAlcool.postDelayed({
                binding.edtAlcool.clearFocus()
            }, 1000)
            return false
        } else if (pGasolina.isEmpty()) {
            binding.edtGasolina.error = "Digite o preço da gasolina!"
            binding.edtGasolina.requestFocus()
            binding.edtGasolina.postDelayed({
                binding.edtGasolina.clearFocus()
            }, 1000)
            return false
        }
        return true
    }
}