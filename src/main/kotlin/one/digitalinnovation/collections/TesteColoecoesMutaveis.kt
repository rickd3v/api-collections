package one.digitalinnovation.collections

fun main() {
    val maria = Funcionario("Maria", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2250.0, "PJ")
    val joao = Funcionario("João", 4000.0, "ClT")

    println("---------- LIST ----------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("--------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("--------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("----------- SET ----------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("--------------------------")
    funcionarioSet.add(maria)
    funcionarioSet.add(pedro)
    funcionarioSet.forEach { println(it) }

    println("--------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }


}