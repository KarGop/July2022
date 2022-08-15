package testngFramework.priorityAttribute;

import org.testng.annotations.Test;

//TestNG annotation hierarchy is followed first and then priority-based execution. 
public class TestWithSamePriority {
	
	//Note: Two tests with no priority will run alphabetically. Test cases with the same priority also run alphabetically.
	@Test(priority=1)
	 public void b_method(){
	    System.out.println("B Method");
	  }

	@Test(priority=1)
	 public void a_method(){
	    System.out.println("A method");
	 }
	 
}
