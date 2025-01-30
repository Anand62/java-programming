package test;

public class Autoboxing {
	public static void main(String[] args) {
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1==i2); //t

		Integer i3 = 129;
		Integer i4 = 129;
		System.out.println(i3==i4); //f

		Integer i5 = 129;
		Integer i6 = 129;
		System.out.println(i5.equals(i6)); //t		
	}
}
