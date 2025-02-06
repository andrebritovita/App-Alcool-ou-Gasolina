package com.andrebritovita.appalcoolougasolina

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.andrebritovita.appalcoolougasolina.databinding.ActivityExplicacaoBinding
import com.andrebritovita.appalcoolougasolina.databinding.ActivityMainBinding

class ExplicacaoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExplicacaoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExplicacaoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}