package genarics

import delegation.Customer

open class Person
class Employee : Person()

fun operate(person: List<Person>) {

}

interface ReadOnlyRepo<out T> {
    fun getInd(id: Int): T
    fun getAll(): List<T>
}

interface WriteRepo<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}

fun main(args: Array<String>) {
    operate(listOf(Person()))
    operate(listOf(Employee()))

    val readOnly = ReadOnlyRepoImpl<Customer>()
    readOnly.getAll()

    val writeRepo = WriteRepoImpl<Customer>()
    writeRepo.saveAll(listOf())
}
