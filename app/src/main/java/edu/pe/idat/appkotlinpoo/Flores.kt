package edu.pe.idat.appkotlinpoo

class Flores {

    val autor = "Diego Vicente"

    class ClaseAnidada{
        fun saludoClaseAnidada(nombre : String) : String{
            return "Hola $nombre, soy una clase anidada"
        }
    }

    inner class ClasesInternas{
        fun saludoClaseInterna(nombre : String) : String{
            return "Hola $nombre, soy una clase interna $autor"
        }
    }
}