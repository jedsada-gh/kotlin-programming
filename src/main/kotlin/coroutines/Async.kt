package coroutines

import kotlinx.coroutines.experimental.*
import java.util.concurrent.CompletableFuture

private fun startLongAsyncOperation(v: Int) {
    CompletableFuture.supplyAsync {
        Thread.sleep(1000)
        "Result: $v"
        println("$v")
    }
}

fun main(args: Array<String>) {
    val feature = async(CommonPool) {
        (1..5).map {
            startLongAsyncOperation(it)
        }
    }

    runBlocking {
        feature.await()
    }
}

// this is your first suspending function
suspend fun doWorld() {

}
