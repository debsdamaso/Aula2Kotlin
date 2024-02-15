fun main(args: Array<String>) {
    println("rm97836@fiap.com.br".removeEspecialChars("@"))

    val concessionaria: Concessionaria = Concessionaria(
        "Ninja 2", null
    )

    val concessionariaCarros = ConcessionariaCarro(
        "","",""
    )
    concessionaria.nome = "Savol"

    println(concessionaria.nome)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}