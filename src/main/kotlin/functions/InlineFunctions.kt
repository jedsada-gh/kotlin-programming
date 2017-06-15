package functions

fun nonop(x: Int) {

}

inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    throw Exception("A Message")
    println("After calling op()")
}

fun tryingToInline(op: () -> Unit) {
    val reference = op
    println("Assigned value")
    op()
}

fun anotherFunction() {
    operation { println("This is this actual op functions") }
}

fun main(args: Array<String>) {
    anotherFunction()
    tryingToInline { nonop(1) }
//    operation { println("This is this actual op functions") }
}
