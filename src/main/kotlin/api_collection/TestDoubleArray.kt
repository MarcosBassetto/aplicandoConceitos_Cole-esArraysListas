package api_collection

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 5000.0

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario -> salarios[index] = salario * 1.1 }

    salarios.forEach { println("forEachIndexed: ${it}") }

    val salariosOf = doubleArrayOf(3000.0, 1000.0, 5000.0)

    salariosOf.sort()

    for(i in salariosOf.indices){
        println("doubelArrayOd.indices: ${salariosOf[i]}")
    }

}