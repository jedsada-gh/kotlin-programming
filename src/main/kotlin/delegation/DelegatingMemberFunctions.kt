package delegation

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
    fun getName(): String
}

interface Logger {
    fun logAll()
}

class Customer(repository: Repository, logger: Logger) : Repository by repository, Logger by logger {
    fun index(): String = getName()
}