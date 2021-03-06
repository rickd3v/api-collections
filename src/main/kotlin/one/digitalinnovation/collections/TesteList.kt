package one.digitalinnovation.collections

fun main() {
    val maria = Funcionario ("Maria", 2000.0, "CLT")
    val joao = Funcionario ("João", 1500.0, "PJ")
    val pedro = Funcionario ("Pedro", 4000.0, "CLT")

    val funcionarios = listOf(maria, joao, pedro)
    funcionarios.forEach { println(it) }

    println("------------------")
    println(funcionarios.find {it.nome == "Maria"})

    println("------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }

}

