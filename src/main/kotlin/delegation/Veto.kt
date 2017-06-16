package delegation

import kotlin.properties.Delegates

class Veto {
    var value: String by Delegates.vetoable("String") { property, oldValue, newValue -> newValue.startsWith("s") }
}

fun main(args: Array<String>) {
    val veto = Veto()
    println(veto.value)
    veto.value = "Thailand"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)
    veto.value = "London"
    println(veto.value)
    veto.value = "spain"
    println(veto.value)
}