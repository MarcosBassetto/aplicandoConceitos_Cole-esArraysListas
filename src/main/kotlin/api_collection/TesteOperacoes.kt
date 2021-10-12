package api_collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    salarios.forEach { println(it) }

    PulaLinha()

    println("O Maior sslário é de: ${salarios.maxOrNull()}")
    println("O Menor salário é de: ${salarios.minOrNull()}")
    println("A média salárial é de: ${salarios.average()}")

    PulaLinha()

    val salariosMaioresQue2500 = salarios.filter { it > 2500 }

    salariosMaioresQue2500.forEach{println("salarios > 2500: ${it}")}

    PulaLinha()
    println(salarios.count{it in 2000.0..5000.0})

    PulaLinha()
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 250.0})

    PulaLinha()
    println(salarios.any{it == 2250.0})
    println(salarios.any{it == 250.0})

}