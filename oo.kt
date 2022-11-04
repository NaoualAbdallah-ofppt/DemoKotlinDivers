// Mots clés modificateurs de visibilité : public, internal, private,protected

// Mots-clés du modificateur d'héritage : open, final,sealed

// dataet valueégalement faire en sorte qu'une classe soit finalimplicitement un effet secondaire

sealed signifie qu'il est open(peut être sous-classé),
 mais les sous-classes (ou les implémentations s'il s'agit
 d'une interface scellée) ne peuvent être définies que dans
  le même module, et le compilateur garde une trace d'une 
  liste exhaustive de toutes les sous-classes.
   Une autre règle est que vous ne pouvez pas en créer
    des sous-classes anonymes ( object: MySealedClass). 
    L'avantage d'un type scellé est que le compilateur
     sait quand vous avez vérifié de manière exhaustive
     un type dans les wheninstructions, les chaînes 
     if/else, etc. Il peut également être utilisé dans une bibliothèque pour s'assurer que seules les implémentations connues d'une classe ou d'une interface sont toujours transmis (empêche les utilisateurs de créer des sous-classes de quelque chose et de les transmettre à la bibliothèque).