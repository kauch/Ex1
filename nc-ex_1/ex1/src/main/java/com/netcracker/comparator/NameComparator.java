package com.netcracker.comparator;

import com.netcracker.entities.Person;

public class NameComparator implements IPersonComparator {

	public int compare(Person firstPerson, Person secondPerson) {
		return firstPerson.getName().compareTo(secondPerson.getName());
	}

}
