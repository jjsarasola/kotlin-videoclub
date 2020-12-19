open class Videoclub {
    private var listaDVD = mutableListOf<DVD>()
    private var listaBlueray = mutableListOf<Blueray>()
    private var listaVHS = mutableListOf<VHS>()
    private var listaConsola = mutableListOf<Consola>()

    fun agregarVHS(vhs: VHS) {
        listaVHS.add(vhs)
        println("El VHS '${vhs.titulo}' fue agregado!")
    }

    fun agregarDVD(dvd: DVD) {
        listaDVD.add(dvd)
        println("El DVD '${dvd.titulo}' fue agregado!")
    }

    fun agregarBlueray(blueray: Blueray) {
        listaBlueray.add(blueray)
        println("El Blueray '${blueray.titulo}' fue agregado!")
    }

    fun agregarConsola(consola: Consola) {
        listaConsola.add(consola)
        println("La consola ${consola.tipo} fue agregada!")
    }

    fun catalagoVHS () {
        println("Inventario de VHS")
        listaVHS.forEach {
            println("Titulo: '${it.titulo}', Año: ${it.año}, Código IMDB: ${it.codIMDB}, Subtitulos: ${it.subtitulos}, Fecha de fabricación: ${it.fechaFabricacion}, Estado: ${it.getEstado()}")
        }
    }

    fun catalagoDVD () {
        println("Inventario de DVD's")
        listaDVD.forEach {
            println("Titulo: '${it.titulo}', Año: ${it.año}, Código IMDB: ${it.codIMDB}, Subtitulos: ${it.subtitulos}, Zona: ${it.zona}")
        }
    }

    fun catalagoBlueray () {
        println("Inventario de Blueray's")
        listaBlueray.forEach {
            println("Titulo: '${it.titulo}', Año: ${it.año}, Código IMDB: ${it.codIMDB}, Subtitulos: ${it.subtitulos}")
        }
    }

    fun catalagoConsola () {
        println("Inventario de Consolas")
        println("Consolas PS4: " + listaConsola.count { it.tipo == "PS4" })
        println("Consolas XBOX: " + listaConsola.count { it.tipo == "XBOX" })
    }

}