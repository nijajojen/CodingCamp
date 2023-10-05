package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		int val = incrementByOne(10);
		System.out.println(val);
		
		int incrementByOneVal = incrementByOneFunction.apply(10);
		System.out.println(incrementByOneVal);
		
		int multipliedVal = multiplyByTenFunction.apply(incrementByOneVal);
		System.out.println(multipliedVal);
		
		Function<Integer,Integer> addByOneThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyByTenFunction);
		System.out.println(addByOneThenMultiplyBy10.apply(10));
		
		System.out.println("BiFunction");
		System.out.println(incrementByoneMultiplyByBiFunction.apply(4, 100));

	}
	//Function first Integer - takes input and 2nd one is out put
	//1 argument and 1 output
	
	static Function<Integer, Integer> incrementByOneFunction = n -> n+1;
	
	static Function<Integer, Integer> multiplyByTenFunction = n -> n*10;
	
	static int incrementByOne(int n) {
		return n+1;
	}
	//BiFunction takes 2 arguments and produces one output
	
	static BiFunction<Integer, Integer, Integer> incrementByoneMultiplyByBiFunction
	 = (n,p) -> (n+1)*p;
}
