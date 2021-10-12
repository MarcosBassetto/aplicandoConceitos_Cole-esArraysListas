package api_collection

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    PulaLinha()

    println(salarios.somatoria())
    PulaLinha()

    println(salarios.media())

}