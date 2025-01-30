package test;

import java.lang.reflect.Field;

class Employee{
	private float k=10;

	private int p=90;

	
}
public class TestClass {

		public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException  {
				Class<?> cl = Class.forName("test.Employee");
				Employee c2 = (Employee) cl.newInstance();
				
				  Field[] fields = cl.getDeclaredFields();

		            for (Field field : fields) {
		                field.setAccessible(true); // Make private fields accessible
		                System.out.println("Field: " + field.getType());
		                System.out.println("Field: " + field.getModifiers());
		                
		                Object value = field.get(c2);
		                System.out.println("Field Value: " + value);
		                System.out.println("----------------------");
		            }
		}
		
}
