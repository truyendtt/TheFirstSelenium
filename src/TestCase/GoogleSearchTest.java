package TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import Common.TestBasic;

public class GoogleSearchTest {

	public static void searchSuccessfully(String searchText) {
		TestBasic testBasic = new TestBasic();
		testBasic.openWebsite("https://www.google.com/");
		testBasic.driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		testBasic.driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
		
		WebElement searchResultElement = testBasic.driver.findElement(By.id("result-stats"));
		
		if(searchResultElement.isDisplayed() ) {
			System.out.println("TC pass");
		}else System.out.println("TC failed");
	}
		

}