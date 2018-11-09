import java.math.BigInteger

fun main(args: Array<String>) {

    println(fibonacci(100000, BigInteger("1"),BigInteger("12")))
}

tailrec fun fibonacci(length:Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (length==0) b else fibonacci(length-1,a+b,a)
}