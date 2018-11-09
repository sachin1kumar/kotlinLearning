fun main(args: Array<String>) {

    Testing.staticFun()

    Testing().nonStaticFun()
}

class Testing {

    companion object {
        fun staticFun(){
            println("Static Method")
        }
    }

    fun nonStaticFun(){
        println("Non static Method")
    }
}