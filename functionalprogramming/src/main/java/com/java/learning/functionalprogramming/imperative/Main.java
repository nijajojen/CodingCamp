package com.java.learning.functionalprogramming.imperative;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> list = List.Of(
				new Person("alfie", "male"),
				new Person("elsa", "female"),
				new Person ("binoy", "male"));
		

	}
	
	static class Person{
		private final String name;
		private final String gender;
		Person(String name, String gender){
			this.name= name;
			this.gender= gender;
			
		}
	}

}
