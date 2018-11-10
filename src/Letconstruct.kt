fun main(args: Array<String>) {

    var address: Address? = Address()

    address?.let {
        perform(address)
    }

}

fun perform(address: Address){

    print("perform called")
}

class Address {

}