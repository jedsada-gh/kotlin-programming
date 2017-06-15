package classes

class Customer {
    private var myCustomField = 10

    var lastPurchasedAmount: Double = 0.0
        get() = field
        set(value) {
            if (value > 100) field = value
            else field = 0.0
        }
}

fun main(args: Array<String>) {
    val customer = Customer()
    println(customer.lastPurchasedAmount)

    customer.lastPurchasedAmount = 200.00
    println(customer.lastPurchasedAmount)

    customer.lastPurchasedAmount = 50.00
    println(customer.lastPurchasedAmount)
}