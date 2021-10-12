package api_collection

fun main() {
    val joao = Funcionario("João", 5000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "PJ")

    val funcionarios = mutableListOf(joao, maria)

    funcionarios.forEach { println(it) }
    PulaLinha()

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }
    PulaLinha()

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }
    PulaLinha()

    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }
    PulaLinha()

    funcionariosSet.add(maria)
    funcionariosSet.add(pedro)
    funcionariosSet.forEach { println(it) }
    PulaLinha()

    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}