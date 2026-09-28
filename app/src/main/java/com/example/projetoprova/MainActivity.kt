package com.example.projetoprova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val botao1 = findViewById<Button>(R.id.btnsoma)
        val botao2 = findViewById<Button>(R.id.btnsubtracao)
        val botao3 = findViewById<Button>(R.id.btnmultiplicacao)

        botao1.setOnClickListener {
            val intent = Intent (this, Soma::class.java)
            startActivity(intent)
        }
        botao2.setOnClickListener {
            val intent = Intent(this, Subtracao::class.java)
            startActivity(intent)
        }
        botao3.setOnClickListener {
            val intent = Intent(this, Multiplicacao::class.java)
            startActivity(intent)
        }
    }
}