package TestCase;

import org.openqa.selenium.WebDriver;

public class ContactUsPage extends Pages {
	
	public ContactUsPage(WebDriver dr) {
		super(dr);
		this.driverWeb= dr;
	}
	
	public HomePage clickBack() {
		driverWeb.navigate().back();
		return new HomePage(this.driverWeb);
	}
}
