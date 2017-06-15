package functions

fun foo(fooParam: String) {

    val outerFunction = "Value"

    fun bar(barParam: String) {
        println(barParam)
        println(fooParam)
        println(outerFunction)
    }

    bar(fooParam)
}

fun main(args: Array<String>) {
    foo("Some Value")
}