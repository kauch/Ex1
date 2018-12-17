package com.netcracker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.LocalDate;

import com.netcracker.entities.Person;

public class App 
{
	private static Logger log = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	Person person1 = new Person("Ivanov", new LocalDate(1996, 8, 29));
        Person person2 = new Person("Sidorov", new LocalDate(2000, 7, 26));
        Person person3 = new Person("Petrov", new LocalDate(2010, 5, 12));
        
        
        log.info("Age of person: " + person1.toString() + ":" + person1.getAge());
        log.error("Age of person: " + person2.toString() + ": " + person2.getAge());
        log.debug("Age of person: " + person3.toString() + ": " + person3.getAge());
        
        
        
    }
}
