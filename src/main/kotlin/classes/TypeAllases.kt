package classes

typealias Name = String
typealias Email = String
class Employee(val name: Name, val email: Email) {
    fun printName(string: String) {
        println(string)
    }
}

fun main(args: Array<String>) {
    val employee = Employee("Jedsada", "jedsada@gmail.com")
    employee.printName("Jedsada")
}
