package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)
    values[0] = 5
    values[1] = 2
    values[2] = 7
    values[3] = 4
    values[4] = 1

    for (valor in values){
        println(valor)
    }

    println("------------------")
    values.forEach{ valor ->
        println(valor)
    }

    println("------------------")
    for (index in values.indices) {
        println(values[index])
    }

    println("------------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }

}