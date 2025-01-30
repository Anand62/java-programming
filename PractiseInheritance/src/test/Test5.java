package test;
class Animal
{
	public void m1(Animal c1)
	{
		System.out.println("Animal :: m1()");
	}
}
class mamel extends Animal
{
	@Override
	public void m1(Animal m)
	{
		System.out.println("mamel :: m1()");
	}
}
class cub extends mamel
{
	@Override
	public void m1(Animal c)
	{
		System.out.println("cub :: m1()");
	}
}
public class Test5 {
	public static void main(String[] args) {
		long start = System.nanoTime();
		Animal c=new cub();
		
		c.m1(c);
		c.m1((cub)(c));
		long end = System.nanoTime();
		System.out.println("Time is :"+(end-start));
		
	}

}
