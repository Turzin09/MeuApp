package com.example.meuapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var velas = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvVelas = findViewById<TextView>(R.id.tvVelas)
        val btnAssoprar = findViewById<Button>(R.id.btnAssoprar)

        atualizarVelas(tvVelas)

        btnAssoprar.setOnClickListener {
            if (velas > 0) {
                velas--
                atualizarVelas(tvVelas)
                if (velas == 0) {
                    Toast.makeText(this, "Parabéns! Fez o pedido?", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun atualizarVelas(tv: TextView) {
        tv.text = getString(R.string.velas_restantes, velas)
    }
}