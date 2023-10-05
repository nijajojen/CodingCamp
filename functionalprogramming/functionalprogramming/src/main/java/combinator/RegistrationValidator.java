package combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static combinator.RegistrationValidator.*;
import static combinator.RegistrationValidator.ValidationResult.SUCCESS;
import static combinator.RegistrationValidator.ValidationResult.PHONE_NUMBER_NOT_VALID;
import static combinator.RegistrationValidator.ValidationResult.IS_NOT_AN_ADULT;
import static combinator.RegistrationValidator.ValidationResult.EMAIL_NOT_VALID;

public interface RegistrationValidator extends 
	Function<Customer, ValidationResult> {
	
	static RegistrationValidator isEmailCorrect() {
		return customer -> customer.getEmail().contains("@") ?
				SUCCESS : EMAIL_NOT_VALID;				
	}
	
	static RegistrationValidator isPhNoValid() {
		 return customer -> customer.getPhoneNumber().startsWith("+07") ?
				 SUCCESS : PHONE_NUMBER_NOT_VALID ;				
	}
	
	static RegistrationValidator isAdult() {
		return customer -> Period.between(customer.dob, LocalDate.now()).getYears() >18 ?
				SUCCESS:IS_NOT_AN_ADULT;
	}
	//Combinator(design pattern) pattern allows to chain more than one functions.
	
	default RegistrationValidator and (RegistrationValidator other) {
		return customer ->{
			ValidationResult result = this.apply(customer);
			return result.equals(SUCCESS) ? other.apply(customer) : result;
		};
		
	}
	
	enum ValidationResult{
		SUCCESS,
		PHONE_NUMBER_NOT_VALID,
		EMAIL_NOT_VALID,
		IS_NOT_AN_ADULT
	}
}
