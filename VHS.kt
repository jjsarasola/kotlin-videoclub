class VHS (var codIMDB : Int, var titulo : String, var año : Int, var subtitulos : String, var fechaFabricacion : String) :Accion {

    var estadoUso : Boolean = false

    override fun usado() {
        if (estadoUso.equals(true)) {
            println("En uso dentro del videoclub!")
        } else {
            println("En el almacén del videoclub!")
        }
    }

    fun usar() {
        estadoUso = true
        println("El VHS de la película $titulo se usará dentro del VideoClub..")
    }

    fun guardar() {
        estadoUso = false
        println("El VHS de la película $titulo se guardará en el almacén del videoclub..")
    }

    fun getEstado() :String {
        return if (estadoUso) {
            "En uso dentro del videoclub."
        } else {
            "En el almacén del videoclub."
        }

    }

}