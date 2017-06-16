package delegation

import kotlin.properties.Delegates

typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email) {
    var department: String by Delegates.observable("", { property, oldValue, newValue ->
        println("Property: $property has changed from $oldValue to $newValue")
    })

    fun printName(string: String) {
        println("name $string")
    }
}

fun main(args: Array<String>) {
    val employee = Employee("Jedsada", "jedsada@gmail.com")
    employee.printName("A String")

    employee.department = "new"
    print(employee.department)

    employee.department = "old"
    print(employee.department)
}
