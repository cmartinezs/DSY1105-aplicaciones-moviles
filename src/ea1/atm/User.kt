package ea1.atm

class User(val username: String, val password: String) {
    fun validatePassword(input: String): Boolean {
        return input.equals(password)
    }
}