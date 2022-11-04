//Fonction qui reçoit des paramètres.
//Les paramètres peuvent avoir des valeurs par défaut
//@JvmOverloads annotation pour la compatibilité avec java 
fun displayRepetitiveMessage(
    message: String,
    errorMessage: String = "Error",
    repeat: Int = 3,
    delay: Int = 0,
    isSilent: Boolean = false)
{
    try{
        Thread.sleep(delay.toLong());
        for(i in 0 until repeat) {
            if (!isSilent) println("$message $i times(s)");
        }
    } catch (ex: InterruptedException){
        println(errorMessage)
    }
}
//exemples d'appel
displayRepetitiveMessage("Checking network connection...")
displayRepetitiveMessage("Checking network connection...", "Something went wrong !")
displayRepetitiveMessage("Checking network connection...", "Something went wrong !", 10)
displayRepetitiveMessage("Checking network connection...", isSilent = true, repeat = 10)

/*Compatibilité avec Java : Les valeurs par défaut
 de paramètres ne sont pas compatibles avec Java, 
Il faut ajouter l’annotation  @JvmOverloads  devant 
la méthode souhaitée afin que le compilateur puisse
 générer automatiquement les méthodes de surcharge
 nécessaires pour Java*/
 
