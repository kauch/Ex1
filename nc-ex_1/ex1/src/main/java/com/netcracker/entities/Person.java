package com.netcracker.entities;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class Person {
	private int ID;
	private String name;
	private LocalDate birthDate;
	
	
	/**
	 * Constructor class Person
	 * @param iD
	 * @param name
	 * @param birthDate
	 */
	
	public Person(int iD, String name, LocalDate birthDate) {
		ID = iD;
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	/**
	 * 
	 * @return 
	 */
	
	public int getAge() {
		DateTime current = new DateTime();
        int age = current.getYear() - birthDate.getYear();
        if(birthDate.getMonthOfYear() > current.getMonthOfYear()) {
        	age--;
        }
        
        if(birthDate.getMonthOfYear() == current.getMonthOfYear() 
        		&& birthDate.getDayOfMonth() < current.getDayOfMonth()) {
        	age++;
        }
        return age;
	}
}
