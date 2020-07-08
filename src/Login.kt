class Login {
    val dataBaseUsers = mapOf("Alfi" to "123456", "Abrar" to "123456")

    fun login() {
        println("----Login----")
        print("Username: ")
        val usernameInput = readLine()
        print("Password: ")
        val passwordInput = readLine()
        println("-------------")
        dataBaseUsers.forEach{
            username,password -> if (usernameInput == username && passwordInput == password) {
            println("Selamat Datang $username")
            MenutUtama().tampilMenu()
        }
        }
    }
}