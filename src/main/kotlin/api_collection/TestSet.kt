package api_collection

fun main() {

    val joao = Funcionario("João", 5000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "PJ")

    val funcionrios1 = setOf(joao, maria)
    val funcionrios2 = setOf(pedro)

    val resultadoUniao = funcionrios1.union(funcionrios2)
    resultadoUniao.forEach{println("união: ${it}")}
    PulaLinha()

    val funcionrios3 = setOf(joao, maria,pedro)
    val subtraindoUniao = funcionrios3.subtract(funcionrios2)
    subtraindoUniao.forEach{println("Subtração: ${it}")}
    PulaLinha()

    val interceptando = funcionrios3.intersect(funcionrios2)
    interceptando.forEach{println("Intersecção: ${it}")}
}
