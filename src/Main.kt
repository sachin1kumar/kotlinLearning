fun main(args: Array<String>){
    //print("hello world!")
    //named parameters
    named(count= 1,str="Sachin")
    named(str = "Rahul",count = 2)

    println("Sachin Kumar".removeSpace())

    var returnedVal = -23.absoluteValue()

    println("returned Int val: $returnedVal")
}


//for default parameters
@JvmOverloads
fun display(string: String,count:Int=2){
   println("display "+count)
}

fun named(str: String,count: Int) {
    println(str+count)
}

// extension function.
fun String.removeSpace() : String{
    return this.replace(" ","")
}

fun Int.absoluteValue(): Int{
    return -this
}