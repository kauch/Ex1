package com.netcracker.cheker;

import com.netcracker.entities.Person;

public class AgeChecker implements IPersonChecker {

	public boolean check(Person person, Object obj) {
		return Integer.valueOf(person.getAge()).equals(obj);
	}

}
