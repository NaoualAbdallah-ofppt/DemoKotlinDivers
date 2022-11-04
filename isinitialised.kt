data class Leg(val nbleg: Int?)
data class Personne(val nom: String,val prenom: String){
    lateinit var leg: Leg
    init
    {
        if(::leg.isInitialized){
            print("Le nom de pieds de $nom $prenom est ${leg.nbleg}")
            }
            else
            {println("non initialisé")}       
    }
   constructor(nom:String,prenom:String,leg:Leg):this(nom,prenom)
{
    this.leg=leg
    if(::leg.isInitialized){
        print("Le nom de pieds de $nom $prenom est ${leg.nbleg}")
        }
        else
        {println("non initialisé")}
} 

    
    fun affiche()="Le nom de pieds de $nom $prenom est ${leg.nbleg}"
}

fun main()
{
    val P1:Personne=Personne("aa","bb")
val P2:Personne=Personne("aa","bb",Leg(2))
println(P1.nom)
println(P2.nom)
}
   
