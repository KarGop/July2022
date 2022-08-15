package testngFramework;

import org.testng.annotations.Test;
//If there are multiple @Test cases, TestNG runs the test cases in the alphabetical order. 
public class MultipleAtTest {
	@Test
	public void alpha(){
		System.out.println("This is Alpha");
	}
	@Test
	public void beta(){
		System.out.println("This is Beta");
	}
}
