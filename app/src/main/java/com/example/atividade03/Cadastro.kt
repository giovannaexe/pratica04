package com.example.atividade03

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Cadastro: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)
        val botao = findViewById<Button>(R.id.botaoCriarConta)
        botao.setOnClickListener {
            val intencao = Intent(this, Login::class.java)
            startActivity(intencao)
        }
    }
}