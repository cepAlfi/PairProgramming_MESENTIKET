class MenutUtama {
    fun tampilMenu() {
        println("""
            1. Pembelian tiket
            2. Refund
            3. Logout
        """.trimIndent())
        val pilihanInput = readLine()

        when(pilihanInput) {
            "1" -> println("Membeli tiket")
            "2" -> println("Refund")
            "3" -> Login().login()
        }
    }
}