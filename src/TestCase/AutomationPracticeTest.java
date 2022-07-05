package TestCase;

import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;

import Common.TestBasic;

//import Common.TestBasic;

public class AutomationPracticeTest {
	public static  void doScenario1() {
		TestBasic testBasic = new TestBasic();
		testBasic.openWebsite("https://automationpractice.com/index.php");
		System.out.println("web is open successfully.");
		
		testBasic.driver.findElement(By.id("contact-link")).click();
		String expectedTitle = "Contact us - My Store";
		String actualTitle= testBasic.driver.getTitle();//ham ho tro
		
			//if(expectedTitle.equals(actualTitle)) {
			//	System.out.println("TC pass");
			//}else System.out.println("TC failed");
			
			
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
		testBasic.driver.navigate().back();
		
		String expectedHomeTitle ="My Store";
		String actualTitleHomeTitle = testBasic.driver.getTitle();
		//if(expectedHomeTitle.equals(actualTitleHomeTitle)) {
	//		System.out.println("TC pass");
		//}else System.out.println("TC failed");
		AssertJUnit.assertEquals(expectedHomeTitle, actualTitleHomeTitle);
		testBasic.driver.navigate().forward();
		testBasic.driver.close();
	}
	public static  void doScenario1_new() {
		String expectedTitle = "Contact us - My Store";
		String expectedHomeTitle ="My Store";
		TestBasic testbasic= new TestBasic();
		
		testbasic.openWebsite("https://automationpractice.com/index.php");
		HomePage homePage = new HomePage(testbasic.driver);
		homePage.printMessage("web is open successfully.");
		ContactUsPage contactUsPage= homePage.clickContactUs();
		AssertJUnit.assertEquals(contactUsPage.getPageTitle(), expectedTitle);
		contactUsPage.clickBack();
		
		AssertJUnit.assertEquals(expectedHomeTitle, contactUsPage.getPageTitle());
		testbasic.driver.navigate().forward();
		testbasic.closeBrower();
	}
	
}
