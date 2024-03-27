package studio7;

public class Fraction {

	private double numerator;
	private double denominator;
	
	public Fraction(double initnumerator, double initdenominator) {
		numerator = initnumerator;
		denominator = initdenominator;
	}
	
	public double getdenominator() {
		return denominator;
	}
	
	public double getnumerator() {
		return numerator;
	}
	
	public Fraction multiply(Fraction other) {
		
		return new Fraction(this.getnumerator() * other.getnumerator(), this.getdenominator()*other.getdenominator());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(3, 5);
		Fraction f2 = new Fraction(9, 25);
		Fraction f3 = f1.multiply(f2);
		System.out.println(f3.numerator);
		System.out.println("-----");
		System.out.println(f3.denominator);
		
	}

}
