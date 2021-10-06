package api_collection

fun main() {

    val values = IntArray(5)
    values[0] = 5
    values[1] = 3
    values[2] = 2
    values[3] = 4
    values[4] = 1

    for(value in values){
        println("valor: ${value}")
    }

    values.forEach { println("valor it: ${it}") }

    for (i in values.indices){
        println("valor indice: ${values[i]}")
    }
    values.sort()
    for(value in values){
        println("valor sort: ${value}")
    }
}