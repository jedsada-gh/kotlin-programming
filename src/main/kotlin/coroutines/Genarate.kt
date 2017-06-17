package coroutines

import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
    val sequence = buildSequence {
        for (i in 1..5) {
            yield(i)
        }
    }

    println(sequence.toList())
}
