class VHS (var codIMDB : Int, var titulo : String, var año : Int, var subtitulos : String, var fechaFabricacion : String) :Accion {

    var estadoUso : Boolean = false

    override fun usado() :String {
        return if (estadoUso) {
            "En uso dentro del videoclub."
        } else {
            "En el almacén del videoclub."
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

}