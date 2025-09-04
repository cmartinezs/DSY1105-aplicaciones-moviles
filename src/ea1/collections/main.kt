package ea1.collections

fun main() {
    val notas = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(notas)

    println("Tamaño: " + notas.size)

    var numeros = mutableListOf<Int>()
    numeros.add(23)

    //var lista = mutableListOf() las colecciones vacias deben indicar el tipo de dato de los elementos

    numeros.forEach { println(it) }
    numeros.forEach(action = { println(it) })
}