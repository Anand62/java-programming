package test;

import java.util.function.Predicate;

class Manager
{
	int age;
	double sal=20000;
	public static boolean mcheck(Manager mng)
	{
		Predicate<Manager> mngCheck=(mngObj)->
		{
			if(mngObj.age>=18)
			{
				System.out.println("You selected");
				return true;
			}
			System.out.println("So sorry you r not !!");
			return false;
		};
		return mngCheck.test(mng);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
}

public class Test3 {
	public static void main(String[] args) {
		Manager mn1=new Manager();
		mn1.setAge(12);
		if(Manager.mcheck(mn1))
		{
			System.out.println("Your Salary Incremented :"+10000);
			mn1.setSal(mn1.getSal()+10000);
			System.out.println("Updated Salary :"+mn1.sal);
		}else
		{
			System.out.println("Your Salary Decremented :"+1000);
			mn1.setSal(mn1.getSal()-1000);
			System.out.println("Updated Salary :"+mn1.sal);
			
		}
		
		
	}
}
