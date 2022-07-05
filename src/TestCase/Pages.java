package TestCase;
import org.openqa.selenium.WebDriver;

//import Common.TestBasic;
public class Pages {
	//TestBasic testBasic = new TestBasic() ;
	public WebDriver driverWeb;
	
	public Pages(WebDriver dr) {
		
		this.driverWeb = dr;
	}
	
	
	public String getPageTitle() {
		return driverWeb.getTitle();
	}
		
	
}
