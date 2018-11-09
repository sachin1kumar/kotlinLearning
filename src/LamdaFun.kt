fun main(args: Array<String>) {

    var link: (String)->Unit = {s:String -> println(s) }

    perform("testing",link)

    perform2("testing2",{s:String -> println(s)})

    perform3({-> println("testing3")})

    print(perform4("testing4", {s:String -> "testing41"}))

    print(perform5("testing5",link))
}

fun perform(n:String, linking: (String)->Unit){

     linking(n)
}

fun perform2(n:String, linking: (String) -> Unit){

    linking(n)
}

fun perform3(linking: () -> Unit){

    linking()
}

fun perform4(n:String, linking: (String) -> String): String{

    return linking(n)
}

fun perform5(n:String, linking: (String) -> Unit) : (String)->Unit{
    return linking
}