package ea1.atm

fun main() {
    do {
        println("Bienvenido a Banco DUOC!")
        var option = getMainOption();
        if (option != 1 && option != 2) {
            println("Opción ingresada no es válida: $option")
            continue
        }

        if (option == 1) {
            val loginOk = login()
            if (!loginOk) {
                println("Autenticación fallida")
                continue
            }
            println("Login existo..")
        }

    } while (option != 2);

    println("Apagando cajero...")
}

fun getMainOption(): Int {
    println("Selecciona una opción")
    println("1. Utilizar cajero")
    println("2. Apagar cajero")
    return readln().toInt()
}

fun login(): Boolean {
    println("Ingrese el usuario: ")
    val inputUser = readln()
    println("Ingrese la contraseña: ")
    val inputPassword = readln()
    val users = getUsers()
    val selectedUser = users.find { user -> user.username.equals(inputUser) }
    if (selectedUser == null) {
        println("Usuario no existe!")
        return false
    }
    return selectedUser.password.equals(inputPassword)
}

fun getUsers(): List<User> {
    return listOf(User("cmartinez", "12345"),
        User("pperez", "54321"),
        User("hgomez", "55443"),)
}