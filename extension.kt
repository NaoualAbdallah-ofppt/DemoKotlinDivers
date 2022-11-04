/*Afin d’étendre le comportement d’une classe,
 qu’elle soit écrite en Java ou en Kotlin,
  nous allons pouvoir, grâce au mécanisme d’extension
   que nous offre Kotlin, ajouter des fonctions qui seront
    perçues comme "appartenant" à la classe elle-même.
grâce aux extensions en Kotlin, nous allons pouvoir
 "ajouter" des méthodes à l’intérieur de classes existantes
 sans les modifier directement ou en hériter
 */
 fun main(){
fun MutableList<String>.shift(){
if(!this.isEmpty()){
this.removeAt(0)
}
else throw NoSuchElementException("Collection vide")
}
val listName: MutableList<String> = mutableListOf("Noé","Jean","Carole","Rose","Luc")
println(listName)
listName.shift()
println(listName)
}