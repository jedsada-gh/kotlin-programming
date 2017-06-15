package classes

class DirectoryExplorer(val user: String) {

    inner class PermissionCheck {

        fun validatePermission() {
            if(user != "user") {

            }
        }
    }

    fun listFolder(folder: String, user: String) {
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}

fun main(args: Array<String>) {
    val de = DirectoryExplorer("user")
    val pc = DirectoryExplorer("user").PermissionCheck()
}