class Blueray (var codIMDB : Int, var titulo : String, var año : Int, var subtitulos : String) :Accion {

    var estadoPrestamo : Boolean = false

    override fun prestar() {
        if (estadoPrestamo) {
            println("El Blueray de la película '$titulo' ya fue prestada!")
        } else {
            estadoPrestamo = true
            println("Se ha prestado el Blueray de la película '$titulo' !")
        }
    }

    override fun devolver() {
        if (!estadoPrestamo) {
            println("El Blueray de la película '$titulo' está en el VideoClub!")
        } else {
            estadoPrestamo = false
            println("El Blueray de la película '$titulo' fue devuelto!")
        }
    }

    override fun prestado() {
        if (!estadoPrestamo) {
            println("El Blueray de la película '$titulo' está en el VideoClub!")
        } else {
            println("El Blueray de la película '$titulo' se encuentra prestado!")
        }
    }
}