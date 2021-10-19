package fr.dauphine.javaavance.td2;

//public class Mere {
//	
//	protected static int meth() {
//		return 42;
//	}
//	public void printMeth() {
//		System.out.println(meth());
//	}
//}
//
//class Fille extends Mere {
//	public static int meth() {
//		return 24;
//	}
//}

class Mere {
	protected int meth=42;
	public void printMeth() {
		System.out.println(meth);
	}
}
class Fille extends Mere {
	public int meth = 24;
}

class Main {

	public static void main(String[] args) {
		Mere mere = new Mere();
		//System.out.println(mere.meth());
		mere.printMeth();
		Fille fille = new Fille();
		//System.out.println(fille.meth());
		fille.printMeth();
		Mere mereFille = new Fille();
		//System.out.println(mereFille.meth());
		mereFille.printMeth();
	}

}

//1.1/Le main affiche les resultats dans l'ordre suivant: 42, 42, 24, 24, 24, 24. Les premieres 2 valeurs de print sont le resultat
//de la methode meth et printMeth de la class Mere puisque 'mere' est une instance de la class Mere.
//Les secondes 2 valeurs de print sont le resultat de la methode meth et printMeth de la class Fille puisque 'fille' est une 
//instance de la class Fille.
//Les 2 dernieres valeurs de print sont le resultat de la methode meth et printMeth de la class Fille puisque 'mereFille' est de 
//type mere mais est une instance de la class Fille qui herite de la class Mere et redefinie la methode meth() de la class Mere.
//On aura donce le resultat de la methode redefinie.

//1.2/S'il est dans Fille, un objet de type Fille aura acces a 2 methodes meth() puisqu'il herite la methode meth() de la class
//Mere et a acces a sa redefinition dans la class Fille. 
//S'il est dans Main, il n'aura acces qu' a la methode meth de la class Fille.

//1.3/les resultats dans l'ordre suivant: 42, 42, 24, 42, 42, 42. Si les methodes meth() sont statiques alors les methodes feront parti de la class et pas des instances de la class et donc
//seul les resultats de la methode meth() de la class Mere sont donnee pour les objets de type Mere.

//1.4/Si meth sont des champs alors la methode meth() de la class Mere n'est plus redefinie dans Fille mais nous y avons toujours
//acces a cause de l'heritage. les resultats seront alors 42, 42, 42.

