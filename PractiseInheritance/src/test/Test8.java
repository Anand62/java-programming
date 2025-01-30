package test;
class A
{
	void m1(int a)
	{
		System.out.println("A value is :"+a);
		
	}
}
class B extends A
{
	void m1(float a)
	{
		System.out.println("B value is :"+a);
		
	}
}

public class Test8 {
	public static void main(String[] args) {
		new B().m1(234);
	}

}
