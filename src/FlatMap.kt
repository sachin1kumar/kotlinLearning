class Data(val items: List<String>) {

}


fun main(args: Array<String>) {

    val data = listOf(Data(listOf("a","b","c")), Data(listOf("1","2","3")))

    val combined = data.flatMap { it.items }
    println(combined)

    val combinedMap = data.map { it.items }
    println(combinedMap)

}