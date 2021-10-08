package api_collection

fun main() {
    val values = intArrayOf(2,3,4,1,10,7)

    values.forEach {
        println("1ª ordenação: ${it}")
    }

    values.sort()
    values.forEach {
        println("2ª ordenação: ${it}")
    }
}