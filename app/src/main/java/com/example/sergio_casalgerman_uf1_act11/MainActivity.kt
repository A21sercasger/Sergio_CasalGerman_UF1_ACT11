package com.example.sergio_casalgerman_uf1_act11

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Modificar esta linea para cambiar entre los diferentes diseños
        setContentView(R.layout.activity_register_linear)

        val btnRegister: Button = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            Toast.makeText(this, "Registro completo", Toast.LENGTH_SHORT).show()
        }
    }
}