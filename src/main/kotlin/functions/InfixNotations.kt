package functions

infix fun String.shouldBeEqualTo(value: String) = this == value

fun main(args: Array<String>) {
    val output = "Hello"

    println(output shouldBeEqualTo "Hello")
}