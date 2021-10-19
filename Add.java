package fr.dauphine.javaavance.td2;

public class Add extends Expr {
	
	private Value value;
	private Expr val;
	
	public Add(Value value, Expr val) {
		this.val=val;
		this.value=value;
	}
	
	public double eval() {
		double res=val.eval()+value.eval();
		return res;
	}

}
