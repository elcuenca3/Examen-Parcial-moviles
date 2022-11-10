package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculo_imc.*
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        caninoimc.setOnClickListener{
            var saltar: Intent = Intent(this, CalculoIMC::class.java)
            startActivity(saltar)

        }
        machoG.setOnClickListener{
            var saltar: Intent = Intent(this, CalculoIMC::class.java)

            startActivity(saltar)

        }
        hembraG.setOnClickListener{
            var saltar: Intent = Intent(this, CalculoIMC::class.java)

            startActivity(saltar)

        }





    }
}