package testngFramework.priorityAttribute;
import org.testng.annotations.Test;

/*The test cases without the priority attribute are given the "priority" 
and executed before the methods with priority.
 Also, they run alphabetically. */

public class TestCaseWithandWithoutPriority {
	@Test(priority = 1)
	public void b_method() {
		System.out.println("This is B method");
	}

	@Test(priority = 1)
	public void a_method() {
		System.out.println("This is A method");
	}

	@Test
	public void d_method() {
		System.out.println("This is D Method");
	}

	@Test
	public void c_method() {
		System.out.println("This is C Method");
	}
}
