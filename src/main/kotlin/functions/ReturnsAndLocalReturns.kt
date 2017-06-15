package functions

fun containingFunction() {
    val numbers = 1..100
//    numbers.forEach {
//        if (it % 5 == 0) {
//            return
//        }
//    }
//    println("Hello")

    numbers.forEach(fun(element) {
        if(element % 5 == 0){
            return
        }
    })
    println("Hello")
}

fun main(args: Array<String>) {
    containingFunction()
}
