fun main(args: Array<String>) {

    var h1 = Header("H1")
    var h2 = Header("H2")

    var h3 = h1 plus h2

    println(h3.name)

    var h31 = h1 + h2

    println(h31.name)

}

class Header(var name:String ){

}

infix operator fun Header.plus(other: Header) : Header {

    return Header(this.name+other.name)

}