package classes

sealed class PageResult

class Success(var content: String) : PageResult()
class Error(var errorCode: Int, var message: String) : PageResult()
class MediumSuccess() : PageResult()

fun getUrlPage(url: String): PageResult {
    if (url == "/") return Success("The content")
    else return Error(404, "Not found")
}

fun main(args: Array<String>) {
    val pageResult = getUrlPage("/")
    when (pageResult) {
        is Success -> println(pageResult.content)
        is Error -> println(pageResult.message)
    }
}