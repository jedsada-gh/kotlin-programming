package metaprogramming

fun <T> printList(obj: List<T>) {
    if (obj is List<*>) {
        println("This is list")
    }
}

fun <T> printList(obj: T) {
    when (obj) {
        is Int -> println("This is Int")
        is String -> println("This is String")
    }
}

inline fun <reified T> erased(input: List<Any>) {
    typeInfo<T>()
}

inline fun <reified T> typeInfo() = print(T::class)

fun main(args: Array<String>) {
    val listInt = listOf(1, 2, 3)
    val listString = listOf("one", "two", "three")
    printList(listInt)
    printList(listString)
    printList(listString[1])

    erased<Any>(listInt)
}