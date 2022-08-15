package testngFramework.ReadDataFromExcel.callExcelFromBaseclass;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setFileName() {
		excelFileName ="createLead";
	}
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String company, String first, String last) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
		driver.findElement(By.name("submitButton")).click();
	}
}






