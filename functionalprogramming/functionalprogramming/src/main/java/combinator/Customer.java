package combinator;

import java.time.LocalDate;

public class Customer {

	public final String name;
	public final String email;
	public final String phoneNumber;
	public final LocalDate dob;
	
	
	public Customer(String name, String email, String phoneNumber, LocalDate dob) {
		this.name = name;
		this.email = email;
		this.phoneNumber= phoneNumber;
		this.dob= dob;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public LocalDate getDob() {
		return dob;
	}
	
}
