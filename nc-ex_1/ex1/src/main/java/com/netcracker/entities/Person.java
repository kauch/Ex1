package com.netcracker.entities;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Person {

	private String name;
	private LocalDate birthDate;
	
	private int ID; // 
    private static int id = 0;
	
	
	/**
	 * Constructor class Person
	 * @param name
	 * @param birthDate
	 */
	
	public Person(String name, LocalDate birthDate) {
		setName(name);
        setBirthDate(birthDate);
        id++;
        setID(id);
	}


    private void setID(int ID) { 
    	this.ID = ID; 
    }


    public int getID() { 
    	return ID; 
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
	
	public int getAge() {
		return Years.yearsBetween(birthDate, LocalDate.now()).getYears();
	}
	
	 public String toString(){
	        return "Class: " + this.getClass().getSimpleName() + 
	        		", Surname:" + getName() + 
	        		", ID:" + getID() + 
	        		", Date of birth:" + getBirthDate();
	 }
}
