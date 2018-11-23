package Demo;



import static org.testng.Assert.assertTrue;

import com.cg.model.Student;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	

	private Student student;	
	private int age;
	
	
	@Given("^Student Name and age$")
	public void student_Name_and_age() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 student=new Student("Priya",21);
		
	    //throw new PendingException();
	}

	@When("^Age greater than (\\d+)$")
	public void age_greater_than(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(student.getStudentAge()>18);
	    //throw new PendingException();
	}

	@When("^Age less than (\\d+)$")
	public void age_less_than(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(student.getStudentAge()<35);
	   // throw new PendingException();
		
	}
	@Then("^Registration done successfully and store it in db$")
	public void registration_done_successfully_and_store_it_in_db() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Registration done sucessfully");
	    //throw new PendingException();
	}



}
