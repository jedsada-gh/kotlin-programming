package delegation

fun localDelegateProperties(){
    val lazy by lazy { initLate() }
}

fun initLate(): String {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
