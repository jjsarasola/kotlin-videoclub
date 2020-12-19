class DVD (var codIMDB : Int, var titulo : String, var año : Int, var subtitulos : String, var zona : Int) :Accion {

    var estadoPrestamo : Boolean = false

    override fun prestar() {
        if (estadoPrestamo) {
            println("El DVD de la película '$titulo' ya fue prestado!")
        } else {
            estadoPrestamo = true
            println("Se ha prestado el DVD de la película '$titulo'!")
        }
    }

    override fun devolver() {
        if (!estadoPrestamo) {
            println("El DVD de la película '$titulo' está en el VideoClub!")
        } else {
            estadoPrestamo = false
            println("El DVD de la película '$titulo' fue devuelto!")
        }
    }

    override fun prestado() {
        if (!estadoPrestamo) {
            println("El DVD de la película '$titulo' está en el VideoClub!")
        } else {
            println("El DVD de la película '$titulo' se encuentra prestado!")
        }
    }
}