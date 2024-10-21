package com.example.albert_montserratsalvatella_uf1_act4

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonToast = findViewById<Button>(R.id.button2)
        buttonToast.setOnClickListener {
            // Acciones a realizar cuando se haga clic en el botón 2
            Toast.makeText(applicationContext, "Boto apretat", Toast.LENGTH_SHORT).show()
        }

        val ButtonLogcat = findViewById<Button>(R.id.button3)
        ButtonLogcat.setOnClickListener {
            // Acciones a realizar cuando se haga clic en el botón 2
            Log.d("Etiqueta", "Boto apretat");
        }
    }
}