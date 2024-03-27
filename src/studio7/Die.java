package studio7;

public class Die {
	private int nsides;
	
public Die(int n) {
	nsides = n;
}
public void print() {
	System.out.println((int) ((Math.random()*nsides)+1));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die(6);
		d1.print();
		Die d2 = new Die(10);
		d2.print();
	}

}
