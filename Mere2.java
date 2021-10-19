package fr.dauphine.javaavance.td2;

import java.io.IOException;

public class Mere2 {

	public void a() {System.out.println("Mere_a"); }
	/**
	 * @param fille
	 */
	void b(Fille2 fille) {System.out.println("Mere_b(Fille)");}

	void c() {System.out.println("Mere_c");}
	/**
	 * @param mere
	 */
	void c(Mere2 mere) {System.out.println("Mere_c(Mere)"); }

	static void d() {System.out.println("static Mere_d");}

	protected void e() {System.out.println("Mere_e");}
	private void f() {System.out.println("Mere_f");}
	public void printF() { f(); }

	Object g() {System.out.println("Mere_g"); return 2;}
	int h() {System.out.println("Mere_h"); return 2;}
	void i() {System.out.println("Mere_i");}

	void j() throws Exception {System.out.println("Mere_j"); }
	void k() throws IOException {System.out.println("Mere_k"); }
	void l() throws Exception {System.out.println("Mere_l"); }
	void m() throws Exception, ArrayIndexOutOfBoundsException {System.out.println("Mere_m"); }
}

class Fille2 extends Mere2{
	void miage() {System.out.println("Miage");}

	public void a() {System.out.println("Fille_a"); }//redefinition

	protected void b(Fille2 fille) {System.out.println("Fille_b(Fille)");}//redefinition

	public void c(Mere2 mere) {System.out.println("Fille_c(Mere)");}//redefinition
	void c(Fille2 b) {System.out.println("Fille_c(Fille)"); }//surcharge

	static void d() {System.out.println("static Fille_d");}//redefinition
	static void d(Mere mere) {System.out.println("Fille_d(Mere)");}//surcharge

	//private void e() {System.out.println("Fille_e");}
	//il ne faut pas changer la visibilite de la methode heritee. cette methode est heritee de Mere2 en protected et non en private

	protected void f() {System.out.println("Fille_f");}//redefinition

	String g() {System.out.println("Fille_g"); return "c";}//surcharge
	
	//char h() {System.out.println("Fille_h"); return "c";}
	//le type de return (string) ne correspond pas au type de la methode (char)
	
	//int i() {System.out.println("Fille_i"); return 3; }
	//le type (int) ne correspond pas au type de la methode i() de Mere2 qui est void e donc il ne devrai meme y avoir aucun
	//return

	void j() throws IOException {System.out.println("Fille_j"); }//surcharge
	
	//void k() throws Exception {System.out.println("Fille_k"); }
	//le type de l'exception ne correspond pas au type de l'exception de la methode k() de Mere2 qui est IOException et non pas
	//Exception tout court
	
	void l() {System.out.println("Fille_l");}//redefinition
	void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }//surcharge
}


//2.3/Surcharge signifie définir plusieurs fois une même méthode avec de différents arguments.
//Redéfinir une méthode c'est héritér une methode de la classe mere, elle aura la meme déclaration de la méthode mere
