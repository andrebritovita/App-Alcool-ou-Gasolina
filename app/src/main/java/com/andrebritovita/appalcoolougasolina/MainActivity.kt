package com.andrebritovita.appalcoolougasolina

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.andrebritovita.appalcoolougasolina.databinding.ActivityCalculoBinding
import com.andrebritovita.appalcoolougasolina.databinding.ActivityMainBinding
const val KEY_CALCULO_ALCOOL_GASOLINA = "CALCULO_ACTIVITY"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnIniciar.setOnClickListener {
            val intent = Intent(this, CalculoActivity::class.java)
            startActivity(intent)
        }
    }
}