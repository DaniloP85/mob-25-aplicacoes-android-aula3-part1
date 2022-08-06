package com.example.exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRodarNumero = findViewById<TextView>(R.id.btn_rodar)

        btnRodarNumero.setOnClickListener {
            val texto = findViewById<TextView>(R.id.txt_sorteio)
            val numeroSorteado = Random().nextInt(11)
            texto.text = "Numero sorteado é: $numeroSorteado"
        }
    }
}