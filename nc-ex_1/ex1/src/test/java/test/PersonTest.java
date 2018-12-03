package test;

import com.netcracker.entities.Person;

import org.joda.time.LocalDate;
import org.junit.Test;

//import junit.framework.TestCase;
import static org.junit.Assert.*;

public class PersonTest {
	  Person personTest1 = new Person(1, "Name", new LocalDate(1990, 10, 3));

	    @Test
	    public void getAge() throws Exception {
	        int actualAge = personTest1.getAge();
	        assertEquals(1, actualAge);
	    }

	    @Test
	    public void getID() throws Exception {
	        assertEquals(1, personTest1.getID());
	    }

	   @Test
	    public void getNamePerson() throws Exception {
		   String name = personTest1.getName();
		   assertEquals("Name", name);
	    }

	    @Test
	    public void getBirthDate() throws Exception {
	        LocalDate date = new LocalDate(1990, 10, 3);
	        assertEquals(date, personTest1.getBirthDate());
	    }
}
