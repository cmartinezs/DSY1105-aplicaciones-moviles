package ea1.atm

class Atm(private val name: String, private val users: List<User>) {
    fun init() {
        println("Bienvenido al ATM de $name!")
    }

    fun selectMainOption(): Int {
        do {
            var option: Int
            try {
                println("Selecciona una opción")
                println("1. Utilizar cajero")
                println("2. Apagar cajero")
                option = readln().toInt()
            } catch (nfe: NumberFormatException) {
                option = 0
            }

            if (option != 1 && option != 2) {
                print("Opción ingresada no válida: $option")
                continue
            }
            return option
        } while (true)
    }

    fun executeMainOption(option: Int): Boolean {
        println("Opción ingresada: $option")

        if (option == 2) {
            println("Apagando atm...")
            return false
        }

        // codigo para ejcutar la opcion 1, usando POO

        return true
    }
}