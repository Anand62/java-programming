package fat;

import test.Anand;

public class My {
	public static void main(String[] args){
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello");
		
	}

	private static void m1() throws Exception {
		throw new ArithmeticException();
	}
}
