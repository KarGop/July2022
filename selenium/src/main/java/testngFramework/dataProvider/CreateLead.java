package testngFramework.dataProvider;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {
	@DataProvider(name="create")
	public String[][] fetchData(){
		String[][] data =  new String[2][3];
		//1st data set
		data[0][0]="Auriss";
		data[0][1]="Karthi";
		data[0][2]="G";
		//2nd data set
		data[1][0]="Euroclear";
		data[1][1]="Indhu";
		data[1][2]="G";
		
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






