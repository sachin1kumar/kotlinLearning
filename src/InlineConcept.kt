fun main(args: Array<String>) {

    download ({
        print("download this")
    })
}

fun download(name: ()-> Unit){

    name()

}
