package coroutines

import kotlinx.coroutines.experimental.*
import java.util.concurrent.CompletableFuture

private fun startLongAsyncOperation(v: Int) = CompletableFuture.supplyAsync {
    Thread.sleep(1000)
    "Result: $v"
}

fun main(args: Array<String>) {
    runBlocking {
        val feature = async(CommonPool) {
            (1..5).map { startLongAsyncOperation(it) }
        }.await().joinToString { it.get() + "\n" }

        println("This before")
        print(feature.replace(",", "").replace(" ", ""))
        println("This after")
    }
}
