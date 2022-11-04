fun displayRepetitiveMessage(message: String, errorMessage: String, repeat: Int, delay: Int, isSilent: Boolean){
    try{
        
        for(i in 0 until repeat) {
            Thread.sleep(delay.toLong());
            if (!isSilent) println("$message $i times(s)");
        }
    } catch (ex: InterruptedException){
        println(errorMessage)
    }
}