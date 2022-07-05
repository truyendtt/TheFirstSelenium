package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common.TestBasic;

//import Common.TestBasic;


public class HomePage extends Pages{
	
	public HomePage(WebDriver dr) {
		super(dr);
		this.driverWeb = dr;
	}
	

	public void clickOncreated() {
		
	//	testBasic.driver.findElement(By.id("contact-link")).click();
		
	}
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	// method có gia tri tra ve= method có return value
	public ContactUsPage clickContactUs() {
		System.out.println("print");
		
		try {
			driverWeb.findElement(By.id("contact-link")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("loi k click ");
			e.printStackTrace();
		}
		System.out.println("driver test" + driverWeb);
		return new ContactUsPage(driverWeb);
	}
	
	public void clickForward() {
		driverWeb.navigate().forward();
	}
}
