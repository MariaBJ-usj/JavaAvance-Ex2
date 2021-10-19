package fr.dauphine.javaavance.td2;

public class ExprMain {
	
	public static void main(String[] args) {
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); //affiche 1337.0
		
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); //affiche 1664.0
		
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); //affiche 2014.0
		
		Expr mult = new Multiply(new Value(2.0), add);
		System.out.println(mult.eval()); //affiche 3328.0
		
		Expr sqrt = new Root(new Value(25.0));
		System.out.println(sqrt.eval()); //affiche 5.0
	}
}
