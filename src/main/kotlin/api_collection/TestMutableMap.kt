package api_collection

fun main() {
    val joao = Funcionario("João", 5000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
    PulaLinha()

    repositorio.findAll().forEach { println(it) }
    PulaLinha()

    repositorio.removeById("Maria")
    repositorio.findAll().forEach { println(it) }
}