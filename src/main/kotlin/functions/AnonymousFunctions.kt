package functions

fun op(x: Int, op: (Int) -> Int) = op(x).div(5)

fun main(args: Array<String>) {

    println(op(5, { it -> it * it }))

    println(op(20, fun(x): Int {
        if (x > 10) return 10
        else return x * x
    }))
}