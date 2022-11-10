package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_calculo_imc.*
import kotlinx.android.synthetic.main.activity_resultado.*

class CalculoIMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo_imc)
        calcular.setOnClickListener{

            var saltar: Intent = Intent(this, Resultado::class.java)
            var peso:String=peso.text.toString()
            var hombro:String=hombro.text.toString()
            var occipucio:String=occipucio.text.toString()
            var nombre:String=nombre.text.toString()
            var gen: String =genero.selectedItem.toString()
            var ras: String =raza.selectedItem.toString()
            var tip: String =tipoCal.selectedItem.toString()
            var imc=imc(peso.toDouble(),hombro.toDouble(),occipucio.toDouble())
            var imcstring=imc.toString()
            println(imc)
            var mensaje=rango(ras,imc)
            saltar.putExtra("nombre", nombre)
            saltar.putExtra("imc",imcstring)
            saltar.putExtra("mensaje",mensaje)

            startActivity(saltar)

        }
    }
    fun imc(pc: Double,hsh:Double,ot:Double): Double {
        var imc=0.0
        imc =pc/(hsh*ot)
        return imc

    }
    fun rango(raza:String,imc:Double): String {
        var mensaje=" "
            if(raza=="mini toy"){
                if (imc>6){
                    mensaje="sobre peso"

                }else if(imc<1){
                    mensaje="peso bajo"

                }else{
                    mensaje="peso adecuado"

                }

            }
        if(raza=="pequeñas"){
            if (imc>15){
                mensaje="sobre peso"

            }else if(imc<7){
                mensaje="peso bajo"

            }else{
                mensaje="peso adecuado"

            }

        }
        if(raza=="medianas"){
            if (imc>27){
                mensaje="sobre peso"

            }else if(imc<14){
                mensaje="peso bajo"

            }else{
                mensaje="peso adecuado"

            }

        }
        if(raza=="grandes"){
            if (imc>39){
                mensaje="sobre peso"

            }else if(imc<25){
                mensaje="peso bajo"

            }else{
                mensaje="peso adecuado"

            }

        }
        if(raza=="gigantes"){
            if (imc>82){
                mensaje="sobre peso"

            }else if(imc<34){
                mensaje="peso bajo"

            }else{
                mensaje="peso adecuado"

            }

        }
        return mensaje

    }
}