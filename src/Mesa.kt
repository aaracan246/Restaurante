class Mesa(val numero: Int, val capacidad: Int) {
    var estado = "libre"


    fun ocuparMesa(){
        if (estado == "libre"){
            estado = "ocupada"
        }
    }

    fun liberarMesa(){
        estado = "libre"
    }

    fun

}