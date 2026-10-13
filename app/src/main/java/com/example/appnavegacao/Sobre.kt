
package com.example.appnavegacao

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Sobre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        val voltar = findViewById<Button>(R.id.btnVoltarSobre)

        voltar.setOnClickListener {
            finish()
        }
    }
}
