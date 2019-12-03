package unittesting;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.app.core.Student;

import custom_exceptions.StudentHandlingException;

import static utils.ValidationRules.*;


public class TestValidationRules {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = StudentHandlingException.class)
	public void testValidatePrn(){
//		fail("Not yet implemented");
		System.out.println("Inside  testValidatePrn "+getClass().getName());
		try {
			validatePrn("DAC-003", new Student[] {new Student("DAC-001", "Buland", "buland@hotmail.com", "DAC", 99),new Student("DAC-002", "Eli", "eli@hotmail.com", "DAC", 39)});
		} catch (StudentHandlingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//assertEquals("DAC-001",);
	}

	@Test
	public void testValidateName() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateCourse() {
		fail("Not yet implemented");
	}

}
