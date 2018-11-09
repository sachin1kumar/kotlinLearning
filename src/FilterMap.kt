fun main(args: Array<String>) {

    val list = listOf(1,2,3,4,5)

    var selecteditems = list.filter { it < 4 }

    for (i:Int in selecteditems){
        println(i)
    }

    var transformedItems = list.map { it*it }

    for (i:Int in transformedItems){
        println(i)
    }

}