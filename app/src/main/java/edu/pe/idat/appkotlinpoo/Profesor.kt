package edu.pe.idat.appkotlinpoo

class Profesor(nombre:String) : Persona(nombre), IProfesor{
    override fun dictarClase() {
        TODO("Not yet implemented")
    }

    override fun registrarAsistencia(codigoAlumno: String, valorAsistencia: Boolean) {
        TODO("Not yet implemented")
    }

    override fun registrarNota(codAlumno: String, nota: Int) {
        TODO("Not yet implemented")
    }

    fun participarHackaton(asistencia : Boolean){

    }
}