fun main(args: Array<String>) {

    var x = 13

    var checkNumber = CheckNumber()
    println(checkNumber.greaterthenTen(x))

    println(checkNumber.lessthanten(13))

}

fun CheckNumber.lessthanten(x: Int): Boolean{
    return x<10
}


class CheckNumber {

    fun greaterthenTen(x: Int): Boolean {
        return x > 10
    }

}