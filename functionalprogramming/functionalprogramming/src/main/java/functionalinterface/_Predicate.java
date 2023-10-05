package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		System.out.println(isPhoneNumberValid("0071234567"));
		System.out.println(isPhoneNumberValidPredicate.test("123"));
		System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0071234567"));
		System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("0071234567"));
	}
	
	static Predicate<String> isPhoneNumberValidPredicate = number-> number.startsWith("007")&& number.length()==10;
	
	static Predicate<String> containsNumber3 = number-> number.contains("3");
	
	
	static boolean isPhoneNumberValid(String number){
		return number.startsWith("007")&& number.length()==10;
	}

}
