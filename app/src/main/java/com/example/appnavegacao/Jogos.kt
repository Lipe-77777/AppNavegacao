
package com.example.appnavegacao

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Jogos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogos)

        val voltar = findViewById<Button>(R.id.btnVoltarJogos)

        voltar.setOnClickListener {
            finish()
        }
    }
}
