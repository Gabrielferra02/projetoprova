package com.example.projetoprova

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Multiplicacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_multiplicacao)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val valor5 = findViewById<EditText>(R.id.valor5)
        val valor6 = findViewById<EditText>(R.id.valor6)
        val btnmult = findViewById<Button>(R.id.btnmult)
        val resultado3 = findViewById<TextView>(R.id.resultado3)

        btnmult.setOnClickListener {
            val valor5 = valor5.text.toString().toDoubleOrNull()
            val valor6 = valor6.text.toString().toDoubleOrNull()
            if(valor5 == null || valor6 == null){
                resultado3.text="Insira os valores."
                return@setOnClickListener
            }
            val resultmult: Double? = valor5 * valor6
            resultado3.text = "Multiplicação $resultmult"
        }
    }
}