package api_collection

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 1400.00)
    val map1 = mapOf(pair)

    map1.forEach {(n,v) -> println("Nome: $n - Valor: $v") }

    val map2 = mapOf(
        "Pedrão" to 2400.0,
        "Mariazinha" to 3000.0,
    )
    map2.forEach { (n, v) -> println("Nome: $n - Valor: $v") }
}