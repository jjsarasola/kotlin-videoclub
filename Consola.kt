class Consola (var tipo : String, var serialNumber : Int) :Accion {

    var estadoPrestamo : Boolean = false

    companion object {
        val PS4 = "PS4"
        val XBOX = "XBOX"
    }

    override fun prestar() {
        if (estadoPrestamo) {
            println("La consola $tipo con el S/N: $serialNumber ya fue prestada!")
        } else {
            estadoPrestamo = true
            println("Se ha prestado la consola $tipo, S/N: $serialNumber!")
        }
    }

    override fun devolver() {
        if (estadoPrestamo == false) {
            println("La consola $tipo, S/N: $serialNumber, está en el VideoClub!")
        } else {
            estadoPrestamo = false
            println("La consola $tipo, S/N: $serialNumber, fue devuelta!")
        }
    }

    override fun prestado() {
        if (estadoPrestamo == false) {
            println("La consola $tipo, S/N: $serialNumber, está en el VideoClub!")
        } else {
            println("La consola $tipo, S/N: $serialNumber, se encuentra prestada!")
        }
    }
}