fun main(args: Array<String>) {

    var list = listOf(1,2,3,4,5)

    var result = list.all { it > 3 }
    println(result)

    var result1 = list.any { it > 3 }
    println(result1)

    var result3 = list.count { it > 3 }
    println(result3)


}