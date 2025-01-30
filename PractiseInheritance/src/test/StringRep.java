package test;

public class StringRep {
	public static void main(String[] args) {
		System.out.println("Enter your Email");
		String str=Anand.sc.nextLine();
		if(str.indexOf('@')==-1)
		{
			System.out.println("invalid Email");
		}
		else
		{
			System.out.println("Valid Email");
		}
	}
}
