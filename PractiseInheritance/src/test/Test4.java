package test;

import java.util.function.Predicate;

public class Test4 {
	public static void m1(Predicate<Integer> v,Predicate<String> s)
	{
		v=(value)->
		{
			return false;
		};
		s=(str)->
		{
			return true;
		};
		System.out.println(v.test(123));
		System.out.println(s.test("anand"));
		
	}
	public static void main(String[] args) {
		Test4.m1(null, null);
	}
}
