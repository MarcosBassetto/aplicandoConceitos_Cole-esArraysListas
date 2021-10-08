package api_collection

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "josé"

    for (nome in nomes){
        println(nome)
    }
    nomes.sort()
    nomes.forEach { println("Sort: ${it}") }

    val nomesOf = arrayOf("Maria", "João", "José")

    for (i in nomes.indices){
        println("nomesOs: ${nomes[i]}")
    }


}