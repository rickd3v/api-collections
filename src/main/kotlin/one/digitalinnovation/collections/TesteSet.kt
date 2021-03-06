package one.digitalinnovation.collections

fun main() {
    val maria = Funcionario("Maria", 1000.0, "CLT")
    val joao = Funcionario("João", 2250.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("--------------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("--------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}