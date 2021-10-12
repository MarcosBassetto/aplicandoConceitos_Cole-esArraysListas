package api_collection

fun main() {

    val joao = Funcionario("João", 5000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "PJ")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }
    println("-------------")
    println(funcionarios.find { it.nome == "Maria" })
    println("-------------")
    funcionarios.sortedBy { it.salario }.forEach { println("Organizado por Salário: ${it}") }
    funcionarios.sortedBy { it.nome }.forEach { println("Organizado por Nome:  ${it}") }
    funcionarios.groupBy { it.tipoContratacao }.forEach { println("Organizado por Tipo de Contrato:  ${it}") }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
       Nome: ${nome} 
       Salario: ${salario} 
       
    """.trimIndent()
}