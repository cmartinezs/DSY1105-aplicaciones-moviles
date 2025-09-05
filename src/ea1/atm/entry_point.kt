package ea1.atm

fun main() {
    do {
        println("Bienvenido a Banco DUOC!")
        var option = getMainOption();
        if (option != 1 && option != 2) {
            println("Opción ingresada no es válida: $option")
            continue
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
