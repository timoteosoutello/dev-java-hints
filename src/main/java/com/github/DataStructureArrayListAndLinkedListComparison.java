package com.github;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataStructureArrayListAndLinkedListComparison {
	public static void main(String[] args) {
		final int size = 1000;
		class Person {
			public Person(String id, int age) {
				this.id = id;
				this.age = age;
			}
			String id;
			int age;
		}
		
		List<Person> linkedList = new LinkedList<>();
		long init = System.nanoTime();
		for (int i = 0; i <= size; i++) {
			Person person = new Person("Test", 1);
			linkedList.add(person);
			//linkedList.remove(person);
		}
		long total = System.nanoTime() - init;
		System.out.println(" Execution in " + total + " ns");

		List<Person> arrayList = new ArrayList<>();
		init = System.nanoTime();
		for (int i = 0; i <= size; i++) {
			Person person = new Person("Test", 1);
			arrayList.add(person);
			//arrayList.remove(person);
		}
		total = System.nanoTime() - init;
		System.out.println(" Execution in " + total + " ns");
	}
}
