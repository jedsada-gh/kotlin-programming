package classes

class Log private constructor() {

    companion object Factory {
        @JvmStatic fun createFileLog(filename: String) = Log(filename)
    }

    constructor(filename: String) : this() {

    }
}

fun main(args: Array<String>) {
    val fileLog = Log.createFileLog("filename.txt")
//    val log = Log()
}
