fun String.removeFirstLastChar(): String 
= this.substring(1, this.length - 1)
fun MutableList<String>.shift(){
    if(!this.isEmpty()){
    this.removeAt(0)
    }
    else throw NoSuchElementException("Collection vide")
    }
    fun Any?.toString(): String {
        if (this == null) return "---"
        // après la vérification nulle, 'ceci' est converti automatiquement en un type non nul, donc le toString() ci-dessous
        // se résout en fonction membre de la classe Any
        return toString()
        }
        
fun main() {

val myString= "Hello Everyone"
val result = myString.removeFirstLastChar()
println("First character is: $result")
val listName: MutableList<String> = mutableListOf("Noé","Jean","Carole","Rose","Luc")
println(listName)
listName.shift()
println(listName)

var x:String? =null
println(x.toString())
}

//this  reprsente l'objet de la classe pourlaquelle
//on souhaite créer l'extension 
//cet objet s'appelle un receiver

