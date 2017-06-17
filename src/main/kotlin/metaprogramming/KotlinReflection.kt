package metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main(args: Array<String>) {
    print(Transaction::class)
    val classInfo = Transaction::class

    getKotlinType(Transaction::class)

    classInfo.memberProperties.forEach {
        println("Properties ${it.name} of type ${it.returnType}")
    }

    classInfo.constructors.forEach {
        println("Constructors ${it.name} + ${it.parameters}")
    }

    val constructor = ::Transaction
    println(constructor)

    val idParam = constructor.parameters.first { it.name == "id" }
    val amountParam = constructor.parameters.first { it.name == "amount" }

    val transaction = constructor.callBy(mapOf(idParam to 1, amountParam to 200.0))
    println(transaction.amount)

    val tran = Transaction(1, 200.00, "New Value")

    val nameProperty = Transaction::class.memberProperties.find { it.name == "id" }

    println (nameProperty?.get(tran))
}