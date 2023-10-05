package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Streams.Gender.MALE;
import static streams._Streams.Gender.FEMALE;
public class _Streams {
	enum Gender {
		MALE,FEMALE
	}
 public static void main(String args[]) {
	 List<Person> people =  new ArrayList<Person>();
		people.add(new Person("alfie",MALE));
		people.add(new Person("elsa",FEMALE));
		people.add(new Person("nija",Gender.FEMALE));
		people.add(new Person("binoy",Gender.MALE));
		
	/*	Function<? super Person, ? extends Gender> personStringFunction = person -> person.gender;
		Consumer println = System.out::println;
		people.stream().map(personStringFunction)
				.collect(Collectors.toSet()).forEach(println);
				*/
		Predicate<? super Person> personPredicate = person -> person.gender.equals(FEMALE);
		boolean containsOnlyFemale = people.stream().allMatch(personPredicate);
		System.out.println(containsOnlyFemale);
 }
 static class Person{
		private final String name;
		private final Gender gender;
		Person (String name, Gender gender){
			this.name = name;
			this.gender = gender;
		}
		@Override
		public String toString() {
			
			return "person{name=" + name + ", Gender="+ gender+"}";
		}
	}
	
}
