//je peux créer des fcts dans d'autres fcts
fun displayRepetitiveMessage(message: String, errorMessage: String, repeat: Int, delay: Int, isSilent: Boolean) {
    // --- Local functions ---
    fun delayFunction() = try { 
        Thread.sleep(delay.toLong())
    } catch (ex: Exception){
        println(errorMessage)
    }
    
    fun printMessage(i: Int) {
        if (!isSilent) println("$message $i time(s)")
    }
    
    // --- Logic ---
    delayFunction()
    for (i in 0 until repeat) printMessage(i)
}