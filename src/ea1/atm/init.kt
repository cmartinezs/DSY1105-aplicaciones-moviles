package ea1.atm

fun main() {
    val atm = Atm("DUOC", getUsers())
    do {
        atm.init()
        val option = atm.selectMainOption()
        val cont = atm.executeMainOption(option)
    } while (cont)
}