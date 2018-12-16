package test;

import com.netcracker.entities.Person;
import static org.junit.Assert.*;
import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	 Person personTest1 = null;
	 
	 @Before
	 public void initialize(){
		 personTest1 = new Person("Name", new LocalDate(1990, 10, 3));
	 }
	 
	    @Test
	    public void getAgeTest() {
	        int actualAge = personTest1.getAge();
	        assertEquals(28, actualAge);
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
