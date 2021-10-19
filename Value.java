package fr.dauphine.javaavance.td2;

public class Value extends Expr {
	private double val;
	
	public Value(double d) {
		this.val=d;
	}
	
	public double eval() {
		return val;
	}

}
