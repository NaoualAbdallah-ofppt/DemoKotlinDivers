// While 
while (isARainyDay) {
    println("I don't love rain...")
}

// Do While
do {
    println("I don't love rain...")
} while (isARainyDay) 

//for
val names = listOf("Jake Wharton", "Joe Birch", "Robert Martin");
//for pour parcourir les valeurs
for (name in names) {
    println("This developer rocks : $name");
}
//for pour parcourir les valeurs par indice 
for (i in names.indices) {
    println("This developer with number $i rocks : ${names[i]}")
}
//for pour parcourir les éléments indice et valeur
for ((index, value) in names.withIndex()) {
    println("This developer with number $index rocks : $value")
}
//for avec un compteur de 1 à 10
for (i in 1..10) {
    println("I love this number : $i")
}
//for de 1 à 10 pas -2
for (i in 10 downTo 1 step 2) {
    println("Index is :$i")
}

//les mots-clés  step  et  downTo  sont en réalité des fonctions dîtes "infix".
//Elle permet de créer un objet Pair (de la bibliothèque Kotlin), un tuple associant 2 valeurs.
