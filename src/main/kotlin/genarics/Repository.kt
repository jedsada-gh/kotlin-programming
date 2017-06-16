package genarics

import java.io.Serializable

open class Entity(val id: Int)

class Repository<T : Entity> {
    fun save(entry: T) {
        if (entry.id != 0) {
            // some work
        }
    }
}

fun <T : Serializable> streamObject(obj: T) {

}

fun main(args: Array<String>) {
    val repo = Repository<CustomerEntity>()
}

class CustomerEntity : Entity(7), Serializable
