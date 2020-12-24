interface Accion {

    fun prestar(){ /* Solo DVS, Blueray y Consola */
    }
    fun devolver() { /* Solo DVS, Blueray y Consola  */
    }
    fun prestado() { /* Solo DVS, Blueray y Consola  */
    }
    fun usado() :String { /* Solo VHS */
        return "Esta funcion es solo para VHS"
    }
}