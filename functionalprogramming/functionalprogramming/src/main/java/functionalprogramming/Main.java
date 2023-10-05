package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	enum Gender {
		MALE,FEMALE
	}
	public static void main(String[] args) {
		
		List<Person> people =  new ArrayList<Main.Person>();
		people.add(new Person("alfie",Gender.MALE));
		people.add(new Person("elsa",Gender.FEMALE));
		people.add(new Person("nija",Gender.FEMALE));
		people.add(new Person("binoy",Gender.MALE));
		
		
		//imperative approach
		List<Person> females = new ArrayList<Main.Person>();
		int femaleCount =0;
		for(Person person: people) {
			if(Gender.FEMALE.equals(person.gender)) {
				femaleCount++;
				females.add(person);
			}
		}
		
		for (Person female:females) {
			System.out.println(female);
		}
		
		System.out.println("//declarative");
		people.stream()
		.filter(person -> Gender.FEMALE.equals(person.gender))
		.forEach(System.out::println);
		
		System.out.println("//declarative by collecting objects to list");
		Predicate<Person> personPredicate = p -> Gender.FEMALE.equals(p.gender);
		List<Person> females2= people.stream()
								.filter(p -> Gender.FEMALE.equals(p.gender))
								.collect(Collectors.toList());
		females2.forEach(System.out::println);
		
		

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
