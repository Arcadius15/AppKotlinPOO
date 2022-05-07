package edu.pe.idat.appkotlinpoo

interface IProfesor {
    fun dictarClase()

    fun registrarAsistencia(codigoAlumno : String, valorAsistencia : Boolean)

    fun registrarNota(codAlumno : String, nota : Int)
}