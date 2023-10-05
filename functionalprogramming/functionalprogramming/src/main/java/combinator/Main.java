package combinator;

import java.time.LocalDate;

import combinator.RegistrationValidator.ValidationResult;

import static combinator.RegistrationValidator.isEmailCorrect;
import static combinator.RegistrationValidator.isPhNoValid;
import static combinator.RegistrationValidator.isAdult;


public class Main {
/*
 * combinator is a design pattern. combinator is a function that takes
 *  multiple functions as an argument and returns a new function
 */
	public static void main(String[] args) {
		Customer customer = new Customer(
				"Alice", 
				"alice@gmail.com", 
				"+0121", 
				LocalDate.of(2000, 1, 1)
				);
		
		//System.out.println(new CustomerValidatorService().isValid(customer));
		
		//using Combinator pattern
		 
			ValidationResult result =	isEmailCorrect()
				.and(isPhNoValid())
				.and(isAdult()).apply(customer);
			System.out.println(result);
			
			if(result != ValidationResult.SUCCESS) {
				throw new IllegalStateException(result.name());
			}

	}

}
