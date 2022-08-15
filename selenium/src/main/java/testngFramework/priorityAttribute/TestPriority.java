package testngFramework.priorityAttribute;

import org.testng.annotations.Test;
/*You can prioritize the order of your test methods by defining a priority.
Based on the defined priority, the test shall execute in that order.*/

public class TestPriority {
	 @Test(priority = 2) // Second Highest Priority
	   public void a_test() {
	   }

	  @Test(priority = 3) // Lowest Priority
	  public void c_test() {
	  }

	  @Test(priority = 1) // Highest Priority
	  public void b_test() {
	  }
}
