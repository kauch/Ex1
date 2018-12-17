package com.netcracker.comparator;

import com.netcracker.entities.Person;

public class BirthDayComparator implements IPersonComparator {

	public int compare(Person firstPerson, Person secondPerson) {
		
		return firstPerson.getBirthDate().compareTo(secondPerson.getBirthDate());
	}

}
