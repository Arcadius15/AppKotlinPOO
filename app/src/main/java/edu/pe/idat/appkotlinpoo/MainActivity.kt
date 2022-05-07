package edu.pe.idat.appkotlinpoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val objAlumno = Alumno("Luis")

        objAlumno.responsabilidad()

        val objProfesor = Profesor("Diego")
        objProfesor.dictarClase()

        var objClaseAnidada = Flores.ClaseAnidada()
        objClaseAnidada.saludoClaseAnidada("Luis")
        var objClaseInterna = Flores().ClasesInternas()
        objClaseInterna.saludoClaseInterna("Luis")

    }
}