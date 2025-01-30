package test;

import java.util.function.Predicate;

class Employee1 {
	int id;
}

public class Test2 {

public static void main(String[] args) {
	Predicate<Employee1> emp=(id)->
	{
		if(id.id==432)
		{
			return true;
		}
		else
		{
			return false;
		}
	};
	
	Employee1 emp1=new Employee1();
	emp1.id=432;
	System.out.println(emp.test(emp1));
	
}
}
