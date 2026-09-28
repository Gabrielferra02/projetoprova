package com.example.projetoprova

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Soma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_soma)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val valor1 = findViewById<EditText>(R.id.valor1)
        val valor2 = findViewById<EditText>(R.id.valor2)
        val btncalcularsoma = findViewById<Button>(R.id.btncalcularsoma)
        val resultado1 = findViewById<TextView>(R.id.resultado1)

        btncalcularsoma.setOnClickListener {
            val valor1 = valor1.text.toString().toDoubleOrNull()
            val valor2 = valor2.text.toString().toDoubleOrNull()

            if (valor1 == null || valor2 == null){
                resultado1.text = "Insira os valores."
                return@setOnClickListener
            }
            val resultadosoma: Double? = valor1 + valor2
            resultado1.text = "Soma: $resultadosoma"
        }

    }
}