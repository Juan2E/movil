package com.sanchez.juan.myapplication

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton

class eventos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eventos)
        val button: Button = findViewById(R.id.button1)
        button.setOnClickListener {
            val intent = Intent(this, registro::class.java)
            startActivity(intent)
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, registro2::class.java)
            startActivity(intent)
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, registro3::class.java)
            startActivity(intent)
        }


    }
    private fun showLogoutDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Cerrar sesión")
            .setMessage("¿Quieres cerrar sesión?")
            .setPositiveButton("Aceptar") { dialog: DialogInterface, _: Int ->
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
            .setNegativeButton("Cancelar") { dialog: DialogInterface, _: Int ->
                dialog.dismiss()
            }
        val alertDialog = builder.create()
        alertDialog.show()
    }
}
