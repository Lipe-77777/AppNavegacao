package com.example.appnavegacao

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.Button
import androidx.core.view.WindowInsetsCompat


package com.example.appnavegacao

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Perfil : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val voltar = findViewById<Button>(R.id.btnVoltarPerfil)

        voltar.setOnClickListener {
            finish()
        }
    }
}

        }

    }
}
