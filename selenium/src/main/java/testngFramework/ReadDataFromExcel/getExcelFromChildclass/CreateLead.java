package testngFramework.ReadDataFromExcel.getExcelFromChildclass;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {
	@DataProvider(name="create")
	public String[][] fetchData() throws IOException{
		String[][] data =  ReadExcelData.getdata("createLead");		
		return data;
	}
	
	@Test(dataProvider="create")
	public void runCreateLead(String company, String first, String last) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
		driver.findElement(By.name("submitButton")).click();
	}
}






