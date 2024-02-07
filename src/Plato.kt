open class Plato(val nombre: String, precio: Double, tiempoPreparacion: Int, ingredientes: MutableList<String>) {

    val precio = precio
    val tiempoPreparacion = tiempoPreparacion
    var ingredientes = ingredientes

    init {
        require(precio > 0.0)
        require(tiempoPreparacion > 1)
        require(ingredientes.isNotEmpty())
    }
    fun agregarIngrediente(ingrediente: String){
        ingredientes.add(ingrediente)
    }

    override fun toString() = "$nombre(${tiempoPreparacion}mins) -> $precio€($ingredientes)"
}