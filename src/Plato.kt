open class Plato(val nombre: String, precio: Double, tiempoPreparacion: Int, ingredientes: MutableList<String>) {

    val precio = precio
    val tiempoPreparacion = tiempoPreparacion
    var ingredientes = ingredientes

    init {
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío." }
        require(precio > 0.0)
        require(tiempoPreparacion > 1)
        require(ingredientes.isNotEmpty()) { "Un plato debe tener al menos un ingrediente." }
    }
    fun agregarIngrediente(ingrediente: String){
        ingredientes.add(ingrediente)
    }

    override fun toString(): String {
        if (ingredientes.size > 1) {
            //"$nombre(${tiempoPreparacion}mins) -> $precio€(${ingredientes.joinToString { ", " }
            ingredientes.dropLast(1).joinToString { ", " } + " y " + ingredientes.last()
        }else{
            ingredientes.joinToString()
        }
    })"
}