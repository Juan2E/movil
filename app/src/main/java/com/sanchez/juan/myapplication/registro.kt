package com.sanchez.juan.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AlertDialog
import android.widget.Button
import android.widget.Toast

class registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val inscribirseButton: Button = findViewById(R.id.btn_inscribirse)

        inscribirseButton.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Confirmar inscripción")
            builder.setMessage("¿Deseas inscribirte en este torneo?")

            builder.setPositiveButton("Aceptar") { dialog, which ->
                Toast.makeText(this, "Inscripción confirmada", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, eventos::class.java)
                startActivity(intent)
            }
            builder.setNegativeButton("Cancelar") { dialog, which ->
                dialog.dismiss()
            }
            builder.show()
        }
    }
}
