package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        var extra=intent.extras

        val nombre=extra?.getString("nombre")?:"sin nombre"
        val imc=extra?.getString("imc")?:"sin peso"
        val mensaje=extra?.getString("mensaje")?:"sin mensaje"

        nomperro.setText("El imc de "+nombre+" es :")
        imcCal.setText(imc)
        mensajePeso.setText(mensaje)




        regresar.setOnClickListener{
            var saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)


        }
    }
}