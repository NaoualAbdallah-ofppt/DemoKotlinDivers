data class User(var email: String, var password: String, var isConnecetd: Boolean) {
    
    companion object {
        fun aa(email: String, password: String) = User(email, password, isConnected: true)    
    }
}

/*
On préférera tout de même utiliser la notion de "top-level" pour la majorité des cas où l’on utilisait auparavant le mot-clé  static  en Java.

L’objet compagnon devra principalement être utilisé dans le cas où vous souhaitez accéder à des éléments internes d’une classe ou stocker des variables/fonctions ayant un lien logique très fort avec la classe.
*/
/*
private const val DEFAULT_SCORE = 100 // Top-Level Property

data class User(var email: String, var password: String, var isConnecetd: Boolean, var defaultScore: Int = DEFAULT_SCORE)
plutôt que l’utilisation de l’objet compagnon :

data class User(var email: String, var password: String, var isConnecetd: Boolean, var defaultScore: Int = DEFAULT_SCORE) {
    companion object {
        private const val DEFAULT_SCORE = 100
    }
}
Les deux solutions fonctionnent, mais la première est un peu plus Kotlin-Friendly que la seconde ! ;)
*/

/*
Pour terminer, sachez également qu’un objet compagnon peut avoir un nom et même implémenter des interfaces :

interface ModelFactory<T> { fun newInstanceFromJson(json: String) : T }

data class User(var email: String, var password: String, var isConnecetd: Boolean) {
    
    companion object Factory: ModelFactory<User> {
        override fun newInstanceFromJson(json: String): User = ...
    }
} */