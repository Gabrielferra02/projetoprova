package com.example.projetoprova

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class Subtracao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_subtracao)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val valor3 = findViewById<EditText>(R.id.valor3)
        val valor4 = findViewById<EditText>(R.id.valor4)
        val btnsub = findViewById<Button>(R.id.btnsub)
        val resultado2 = findViewById<TextView>(R.id.resultado2)

        btnsub.setOnClickListener {
            val valor3 = valor3.text.toString().toDoubleOrNull()
            val valor4 = valor4.text.toString().toDoubleOrNull()
            if (valor3 == null || valor4 == null){
                resultado2.text = "Insira os valores."
                return@setOnClickListener
            }
            val resultsub: Double? = valor3 - valor4
            resultado2.text = "Subtração $resultsub"
        }

    }
}