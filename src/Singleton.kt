fun main(args: Array<String>){

    Singleton.testFun()
}

open class Application {

    open fun testFun(){
        println("parent")
    }
}

object Singleton : Application() {

    override fun testFun() {
        println("child")
    }

}