package optionals;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Object optionalVal = Optional.ofNullable("Hello").orElseGet(() -> "default value");
		System.out.println(optionalVal);
		Object optionalVal2 = Optional.ofNullable(null).orElseGet(() -> "default value printed because its null");
		System.out.println(optionalVal2);
		Optional.ofNullable("nija@gmail.com").ifPresent(email -> System.out.println("sending email to "+email));
		Optional.ofNullable(null).ifPresent(email -> System.out.println("sending email to "+email));

	}

}
