package classes

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerController {
    lateinit var repository: Repository

    fun index(): String = repository.getAll().toString()
}

fun main(args: Array<String>) {
    val customerController = CustomerController()
    println(customerController.index())
}
