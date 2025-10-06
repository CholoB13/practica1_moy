package com.example.practica1_moy


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("EXTRA_NAME")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val phone = intent.getStringExtra("EXTRA_PHONE")

        findViewById<TextView>(R.id.textViewName).text = "Nombre: $name"
        findViewById<TextView>(R.id.textViewEmail).text = "Correo: $email"
        findViewById<TextView>(R.id.textViewPhone).text = "Teléfono: $phone"
    }
}