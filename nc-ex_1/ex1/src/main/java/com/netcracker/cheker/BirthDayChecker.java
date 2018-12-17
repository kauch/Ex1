package com.netcracker.cheker;

import com.netcracker.entities.Person;

public class BirthDayChecker implements IPersonChecker {

	public boolean check(Person person, Object obj) {
		return person.getBirthDate().equals(obj);
	}

}
