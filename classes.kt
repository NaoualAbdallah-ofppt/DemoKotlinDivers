class User(email:String var password: String,  age: Int)
{//on a pas utilisé val ou var avec l'age
//car on va déclarer l'attribut plus tard pour
//changer son setter
//age ici est considéré comme paramètre 

    var email: String=mail
    //lateinit ne peut pas être utilisée avec
    //get et set explicite
    get() { 
        println("User is getting his email."); 
        return field 
    }
    set(value) { 
        println("User is setting his email"); 
        field = value 
    }
    //Le mot clé lateinit peut être uniquement utilisé avec une variable var.
    var age:Int=age
   //On a pas besoin de modifier le getter 
   //donc on va pas le mettre
    set(value) { 
       if ( value<0) throw Exception("rr")
       else
       field = value 
    }
}
//Le mot-clé  field fait référence à la propriété 
//elle-même pour éviter de boucler à l'infini
//on appelle cela le "Backing Field".


fun main()
{
    val U=User("rrr",56)
    U.age=-5
    U.email="aa@xx.com"
    println(U.email)
}