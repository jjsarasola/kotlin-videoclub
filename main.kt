fun main() {
    val blowbuster = Videoclub()

    val dvd1 = DVD(233, "The ninth gate", 1999, "Castellano", 0)
    blowbuster.agregarDVD(dvd1)

    val dvd2 = DVD(455, "World War Z", 2013, "Castellano", 0)
    blowbuster.agregarDVD(dvd2)

    println("")

    val br1 = Blueray(13299, "No country for old men",2007, "Castellano")
    blowbuster.agregarBlueray(br1)

    val br2 = Blueray(599, "Fargo",1996, "Castellano")
    blowbuster.agregarBlueray(br2)

    println("")

    val vhs1 = VHS(122, "Mars Attacks!", 1996, "Castellano", "23/01/1997")
    blowbuster.agregarVHS(vhs1)

    val vhs2 = VHS(43, "Thinner", 1996, "Castellano", "04/05/1998")
    blowbuster.agregarVHS(vhs2)
    vhs2.usar()

    println("")

    val consola1 = Consola(Consola.XBOX, 34673092)
    blowbuster.agregarConsola(consola1)

    val consola2 = Consola(Consola.PS4, 38289090)
    blowbuster.agregarConsola(consola2)

    val consola3= Consola(Consola.PS4, 38289091)
    blowbuster.agregarConsola(consola3)

    println("")

    blowbuster.catalagoDVD()
    println("")
    blowbuster.catalagoBlueray()
    println("")
    blowbuster.catalagoVHS()
    println("")
    blowbuster.catalagoConsola()

    println("")
    dvd1.prestar()
    dvd2.prestar()
    dvd1.devolver()
    dvd2.prestar()


    println("")
    consola1.prestar()
    consola2.prestar()
    consola3.prestar()
    consola1.devolver()
    consola2.prestado()
    consola3.prestado()
    consola1.prestado()

    println("")
    vhs2.guardar()
}