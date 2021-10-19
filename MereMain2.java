package fr.dauphine.javaavance.td2;

public class MereMain2 {
	
	public static void main(String[] args) throws Exception {
		Mere2 mere=new Mere2();
		Mere2 mereFille=new Fille2();
		Fille2 fille=new Fille2();

		//mere.miage();//cette methode n'existe pas Mere2
		fille.miage();//execute la methode miage de Fille2 affichant "Miage"
		//mereFille.miage();//mereFille est de Type Mere2 et la methode miage n'existe pas dans Mere2
		((Fille2)mereFille).miage();//execute la methode miage de Fille2 affichant "Miage"

		mere.a();//execute la methode a() de Mere2 affichant "Mere_a"
		mereFille.a();//execute la methode a() de Fille2 affichant "Fille_a"
		fille.a();//execute la methode a() de Fille2 affichant "Fille_a"
		((Mere2)mereFille).a();//execute la methode a() de Fille2 affichant "Fille_a"
		mereFille.b(null);//execute la methode b() de Fille2 affichant "Fille_b(Fille)"

		mereFille.c();//execute la methode c() de Mere2 affichant "Mere_c"
		mereFille.c(mere);//execute la methode c(Mere2 mere) de Fille2 affichant "Fille_c(Mere) car c(Mere2 mere) est la redefinition de c(Mere2 mere) de Mere2"
		mereFille.c(mereFille);//execute la methode c(Mere2 mere) de Fille2 affichant "Fille_c(Mere) car c(Mere2 mere) est la redefinition de c(Mere2 mere) de Mere2"
		mereFille.c(fille);//execute la methode c(Mere2 mere) de Fille2 affichant "Fille_c(Mere) car mereFille est de type Mere2"
		fille.c(fille);//execute la methode c() de Fille2 affichant "Fille_c(Fille) car fille est de type Fille2"

		mere.d();//execute la methode d() de Mere2 affichant "static Mere_d" car mere est de type Mere2
		mereFille.d();//execute la methode d() de Mere2 affichant "static Mere_d" car mereFille est de type Mere2

		mere.printF();//execute la methode f() de Mere2 affichant "Mere_f" car mere est de type Mere2
		mereFille.printF();//execute la methode f() de Mere2 affichant "Mere_f" car mereFille est de type Mere2

		mereFille.j();//execute la methode j() de Fille2 affichant "Fille_j" car j() est une surcharge de la methode j() de Mere2
		mereFille.k();//execute la methode k() de Mere2 affichant "Mere_k" 
		mereFille.l();//execute la methode l() de Fille2 affichant "Fille_l" car l() est une redefinition de la methode l() de Mere2
		mereFille.m();//execute la methode m() de Fille2 affichant "Fille_l" car m() est une surcharge de la methode m() de Mere2
	}
}
