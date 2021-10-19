package fr.dauphine.javaavance.td2;

public class Root extends Expr{

	private Expr val;
	
	public Root(Expr val) {
		this.val=val;
	}
	
	public double eval() {
		double res=Math.sqrt(val.eval());
		return res;
	}
}
