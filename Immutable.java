package Java_Basics;

public final class Immutable{
	final int a;
	final double r;
	
public Immutable(int a, double r) {
		this.a=a;
		this.r=r;
		}
 public int getA() {
	 return a;
 }
public double getB() {
	return r;
	
}
}
class Abc{
	public static void main(String[] args) {
		Immutable i = new Immutable(6,7.889);
		System.out.println("integer ="+ i.getA());
		System.out.println("double="+ i.getB());
		}
}
