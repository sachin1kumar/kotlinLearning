fun main(args: Array<String>) {

    pass(2, object : Process {
        override fun execute() {
            print("anonymous")
        }
    })
}

interface Process {
    fun execute()
}

fun pass(num:Int,inter: Process){

    inter.execute()

}