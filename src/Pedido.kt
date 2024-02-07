class Pedido(var numero: Int, var platos: MutableList<Plato>, var estado: String = "pendiente"){
    companion object{
        //No pertenece a ningún pedido en concreto, sino que es un valor global a todos y se utilizará para calcular automáticamente los números de los pedidos.
    }

    fun agregarPlato(plato: Plato){
        platos.add(plato)
    }

    fun eliminarPlato(nombrePlato: String){

    }

    fun calcularPrecio(){

    }

    fun calcularTiempo(){

    }

    override fun toString() = ""

}