package com.netcracker.cheker;

import com.netcracker.entities.Person;

public class NameChecker implements IPersonChecker {

	public boolean check(Person person, Object obj) {
		return person.getName().equals(obj);
	}

}
