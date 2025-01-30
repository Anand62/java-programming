package test;
 interface indal
{
	void m3();
}
final record Customer(int id,String name) 
{
	public void m3()
	{
		System.out.println("Record :: inteface");
	}
	static int asdf=324;
	public  void m1()
	{
		System.out.println("m1() :: method");
	}
	public Customer
	{
		id=9;
	}
	static
	{
		System.out.println("Hello");
	}
}
public class Test6 {
	public static void main(String[] args) {
			Customer cust=new Customer(123, "Anand");
			System.out.println(cust);
			System.out.println(cust.id());
			cust.m3();
	}

}
