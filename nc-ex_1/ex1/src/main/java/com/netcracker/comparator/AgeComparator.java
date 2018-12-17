package com.netcracker.comparator;

import com.netcracker.entities.Person;

public class AgeComparator implements IPersonComparator {

	public int compare(Person firstPerson, Person secondPerson) {
		return firstPerson.getAge() - secondPerson.getAge();
	}

}
