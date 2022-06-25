package com.example.atividade03

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)
        val botao = findViewById<Button>(R.id.botaoEntrar)
        botao.setOnClickListener {
            val intencao = Intent (this,Lista::class.java)
            startActivity(intencao)
        }
    }
}