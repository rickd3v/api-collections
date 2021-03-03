package one.digitalinnovation.collections

fun main (){
    val values = intArrayOf(5, 4, 1, 7, 9)

    values.forEach {
        println(it)
    }

    println("---------------")

    values.sort()
    values.forEach {
        println(it)
    }
}