package studio7;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	public Rectangle(double initlength, double initwidth) {
		length = initlength;
		width = initwidth;
		area = length * width;
		perimeter = (2 * length) + (2 * width);
	}
	public String print() {		
		return ("area: " + area);
	}
	public boolean square() {
		if (length == width) {
			return true;
		}
		else { 
			return false;
		}
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(69, 55);
		System.out.println("r1 " + r1.print());
		System.out.println("r1 is a square: " + r1.square());
		Rectangle r2 = new Rectangle(10, 10);
		System.out.println("r2 " + r2.print());
		System.out.println("r2 is a square: " + r2.square());
		if (r1.area > r2.area) {
			System.out.println("r1 is larger in area.");
		}
		else if (r1.area == r2.area)
		{
			System.out.println("r1 and r2 have the same area.");
		}
		else
			System.out.println("r2 is larger in area.");
		}
		
		// TODO Auto-generated method stub

	}


