package com.example.projetoprova

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Divisao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_divisao)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val valor7 = findViewById<EditText>(R.id.valor7)
        val valor8 = findViewById<EditText>(R.id.valor8)
        val btncalculardiv = findViewById<Button>(R.id.btncalculardiv)
        val resultado4 = findViewById<TextView>(R.id.resultado4)

        btncalculardiv.setOnClickListener {
            val valor7 = valor7.text.toString().toDoubleOrNull()
            val valor8 = valor8.text.toString().toDoubleOrNull()

            if (valor7 == null || valor8 == null ){
                resultado4.text = "Insira os valores."
                return@setOnClickListener
            }
            val resultadodiv: Double? = valor7 / valor8
            resultado4.text = "Divisão: $resultadodiv"
        }

    }
}