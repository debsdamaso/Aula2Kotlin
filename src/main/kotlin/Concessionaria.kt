open class Concessionaria( //toda classe tipo open já é por natureza uma data
    open var nome: String = "Ninja",
    open val endereco: String?,   //? é que pode ser nulo
    open val telefone: String? = "11 987654321" //pode ser nulo ou padrao ja definido
) {
    val listaMotos: ArrayList<String>? = arrayListOf()
    val listaCarros: ArrayList<String>? = arrayListOf()

    fun retornaLista() = listaCarros

}