package testngFramework;

import org.testng.annotations.Test;

public class descriptionAttribute {
	//You can describe your test case under the description
	@Test(description="sample desc")
	public void sample() {
		System.out.println("This is the starting point of the test");
	}
}
