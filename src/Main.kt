fun main() {
    do {
        println("""
            1. Login
            0. Exit
        """.trimIndent())
        var inputUser = readLine()

        if(inputUser == "1") {
            Login().login()
        }
    } while (inputUser != "0")
}